package com.dslplatform.ocd
package config

import scalax.io.Codec.UTF8
import scala.collection.mutable.LinkedHashMap
import scala.collection.JavaConverters._
import test.javatest.TestSuiteCreator
import test.javatest.JavaInfo
import org.apache.commons.io.IOUtils
import org.apache.commons.lang.SystemUtils
import java.io.InputStream
import java.nio.file.Files
import java.nio.file.StandardCopyOption
import java.io.FileOutputStream
import java.nio.file.SimpleFileVisitor
import java.nio.file.FileVisitResult
import java.nio.file.attribute.BasicFileAttributeView
import java.nio.file.attribute.BasicFileAttributes
import java.nio.file.attribute.DosFileAttributes
import java.nio.file.attribute.PosixFileAttributes
import java.nio.file.attribute.PosixFileAttributeView
import java.nio.file.attribute.AclFileAttributeView
import java.nio.file.attribute.DosFileAttributeView
import java.nio.file.attribute.FileOwnerAttributeView
import java.nio.file.attribute.UserDefinedFileAttributeView
import java.nio.file.attribute.PosixFilePermission
import java.nio.file.attribute.PosixFilePermissions


private[config] class TestDeployer(
    logger: Logger
  , testSettings: ITestSettings
  ) extends ITestDeployer {

  private val root = testSettings.workspace.path
  private val toolsTargetPath = root / "tools"

  if (!root.exists) {
          logger.trace("Creating the root target path: " + root.path)
          root.createDirectory(true, false)
  }

  class TestSetup(testProject: ITestProject, projectNamesAndPortsRepository : ProjectNamesAndPortsRepository) {

    private def javaParentBasedOnCurrentOs: String = {
      if(SystemUtils.IS_OS_WINDOWS){
        return "java_windows"
      }else if(SystemUtils.IS_OS_LINUX){
        return "java_linux"
      }else{
        throw new RuntimeException("Unsupported OS, cannot deploy project java tools resource.")
      }
    }


    private val projectRoot = root / (testProject.projectPath, '/')
    private val libPath = root / "tools" / "java" / "lib"

    private val projectShortName = testProject.projectPath.replaceAll(".*/","")

    private val revenjConfigTemplateTargetPath = projectRoot / "config"
    private val dslSource = projectRoot / "dsl"

    private val DSL_PROJECT_INI = "dsl-project.ini"
    private val REVENJ_CONFIG_TEMPLATE_DIRNAME = "revenj"
    private val REVENJ_CONFIG_TEMPLATE_FILENAME = "Revenj.Http.exe.config.template"

    private def languageProjectRoot(language: Language) =
      projectRoot / language.language.toLowerCase.concat("_project")

    private def mainRoot(language: Language) =
      languageProjectRoot(language) / "src" / "main"

    private def mainCode(language: Language) =
      mainRoot(language) / language.language.toLowerCase()

    private def mainResources(language: Language) =
      mainRoot(language) / "resources"

    private def generatedRoot(language: Language) =
      languageProjectRoot(language) / "src" / "generated"

    private def generatedCode(language: Language) =
      generatedRoot(language) / language.language.toLowerCase()

    private def generatedResources(language: Language) =
      generatedRoot(language) / "resources"

    private def testRoot(language: Language) =
      languageProjectRoot(language) / "src" / "test"

    private def testCode(language: Language) =
      testRoot(language) / language.language.toLowerCase()

    private def testResources(language: Language) =
      testRoot(language) / "resources"

    private def cleanDsl(): Unit = {
      logger.debug("Cleaning generated DSL ...")
      logger.trace("Deleting: " + dslSource.path)

      val remaining = dslSource.deleteRecursively(true, true)._2
      if (remaining > 0) {
        logger.warn(s"Could not delete all generated DSL ($remaining)!")
      }
    }

    private def deployDsl(): Unit = {
      val dsls = testProject.dslFiles
      dsls.par foreach { case (filename, body) =>
        val path = dslSource / (filename, '/')
        logger.trace("Deploying DSL: " + path.path)
        path.write(body)
      }
    }

    /**
     * Copy the server configuration file;
     * The command line client will download the actual server files.
     */
    private def copyServerConfigurationTemplate(): Unit = {

      val revenjTemplateDir = new java.io.File(classOf[TestDeployer].getResource(s"/template.$REVENJ_CONFIG_TEMPLATE_DIRNAME").toURI());
      val revenjTargetDir = new java.io.File(revenjConfigTemplateTargetPath.toURI);

      if (!revenjConfigTemplateTargetPath.exists) {
          logger.trace("Creating the revenj target path: " + revenjConfigTemplateTargetPath.path)
          revenjConfigTemplateTargetPath.createDirectory(true, false)
        }

      copyPath(revenjTemplateDir.toPath, revenjTargetDir.toPath);

      val revenjTemplateConfigPath = s"/template.$REVENJ_CONFIG_TEMPLATE_DIRNAME/$REVENJ_CONFIG_TEMPLATE_FILENAME"

      logger.trace("revenjTemplateConfigPath: " + revenjTemplateConfigPath)

      val revenjConfig = applyTemplates(IOUtils.toString(
                classOf[TestDeployer].getResourceAsStream(
                    revenjTemplateConfigPath)))

      val revenjConfigTargetPath = revenjConfigTemplateTargetPath / REVENJ_CONFIG_TEMPLATE_FILENAME

      logger.trace("Writing the revenj configuration at: " + revenjConfigTargetPath.path);
      revenjConfigTargetPath.write(revenjConfig)(UTF8)

      ()
    }

    private def deployGenerated(): Unit =
      testProject.testFiles foreach { case (language, files) =>
        val generatedRoot = generatedCode(language)
        if (!generatedRoot.exists) {
          logger.trace("Creating the generated path: " + generatedRoot.path)
          generatedRoot.createDirectory(true, false)
        }

        val resourcePath = generatedResources(language)
        if (!resourcePath.exists) {
          logger.trace("Creating the generated resource path: " + resourcePath.path)
          resourcePath.createDirectory(true, false)
        }

        /* TODO: See for .ini if it's at all neccessary, or for the tests .ini from testIniPath is used (the one called 'template.dsl-project.ini').
         * If so, this probably needs to be deleted, and replace with the other .ini file. */
        val projectIniPath = generatedResources(language) / DSL_PROJECT_INI
        val projectIniSource = "/config/" + projectIniPath.relativize(root).path.replace('\\', '/')

        try {
          val projectIniBody = IOUtils.toByteArray(
                classOf[TestDeployer].getResourceAsStream(
                    projectIniSource))

          logger.trace("Creating the DSL project file: " + projectIniPath.path)
          projectIniPath.write(projectIniBody)
        }
        catch {
          case _: Exception =>
            logger.warn(s"Could not copy $DSL_PROJECT_INI from: " + projectIniSource)
        }
      }

    private def deployMain(): Unit =
      testProject.testFiles foreach { case (language, files) =>
        val mainRoot = mainCode(language)
        if (!mainRoot.exists) {
          logger.trace("Creating the main path: " + mainRoot.path)
          mainRoot.createDirectory(true, false)
        }

        val resourcePath = mainResources(language)
        if (!resourcePath.exists) {
          logger.trace("Creating the main resource path: " + resourcePath.path)
          resourcePath.createDirectory(true, false)
        }

        val path = resourcePath / "dsl.props"
        logger.trace("Deploying the dsl.props file: " + path.path)

        val body = applyTemplates(IOUtils.toString(
          classOf[TestDeployer].getResourceAsStream("/template.dsl.props")))

        path.write(body)
      }

    private def cleanTests(): Unit = {
      val languages = testProject.testFiles.keys.toSet

      languages foreach { language =>
        logger.debug(s"Cleaning tests ($language) ...")
        val path = testRoot(language)
        logger.trace("Deleting: " + path.path)

        val remaining = path.deleteRecursively(true, true)._2
        if (remaining > 0) {
          logger.warn(s"Could not delete all code for $language ($remaining)!")
        }
      }
    }

    private def deployTests(): Unit =
      testProject.testFiles foreach { case (language, files) =>
        val languageRoot = testRoot(language)

        val classes = files.values.map(JavaInfo(_).classPath).toIndexedSeq.sorted
        val suite = JavaInfo(
          new TestSuiteCreator {
            def packageName = "com.dslplatform.ocd.test"
            def testName = testProject.ProjectNameCamel
            def testClasses = classes
          } testBody
        )

        val suiteWithTests = files + suite.toEntry

        suiteWithTests.par foreach { case (filename, body) =>
          val path = languageRoot / (filename, '/')
          logger.trace("Deploying test: " + path.path)
          path.write(Patches.fixTests(body))
        }

        val resourcePath = testResources(language)
        logger.trace("Creating the test resource path: " + resourcePath.path)
        resourcePath.createDirectory(true, false)

        {
          val resourceLogback = resourcePath / "logback-test.xml"
          logger.trace("Writing logback-test.xml: " + resourceLogback.path)
          val logbackBody = applyTemplates(IOUtils.toString(
                classOf[TestDeployer].getResourceAsStream("/template.logback-test.xml")))
          resourceLogback.write(logbackBody)
        }
        {
          val resourceDslProjectIni = testResources(language) / DSL_PROJECT_INI
          logger.trace(s"Writing $DSL_PROJECT_INI: " + resourceDslProjectIni.path)
          val dslProjectIniBody = applyTemplates(IOUtils.toString(
                classOf[TestDeployer].getResourceAsStream(s"/template.$DSL_PROJECT_INI")));
          resourceDslProjectIni.write(dslProjectIniBody)
        }
      }

    private def deployCompilerScript(): Unit =
      testProject.testFiles.keys foreach { case language =>
        val languageRoot = languageProjectRoot(language)
        language match {
          case JAVA =>
            {
                copyTemplate("compiler.bat", languageRoot);
                copyTemplate("build.xml", languageRoot);
                copyTemplate("compiler-ocd.sh", languageRoot, PosixFilePermission.GROUP_EXECUTE, PosixFilePermission.OWNER_EXECUTE, PosixFilePermission.OTHERS_EXECUTE );
                copyTemplate(".pgpass", languageRoot);
            }
          case _ =>
        }
      }

    private def copyTemplate(scriptName: String, target: Path, permissions: PosixFilePermission*) = {
        val path = target / scriptName
        logger.trace("Creating the "+ scriptName +" script: " + path.path)

        val body = applyTemplates(IOUtils.toString(
        classOf[TestDeployer].getResourceAsStream("/template."+scriptName)))

        path.write(body)

        val javaPath = java.nio.file.Paths.get(path.toURI)
        val perms = Files.getPosixFilePermissions(javaPath)
        for (permission <- permissions){
                perms.add(permission);
        }
        Files.setPosixFilePermissions(javaPath, perms)
    }

    private def deployEclipseProject(): Unit =
      testProject.testFiles.keys foreach { case language =>
        val languageRoot = languageProjectRoot(language)

        language match {
          case JAVA =>
            val projectPath = languageRoot / ".project"
            val classpathPath = languageRoot / ".classpath"

            logger.trace("Creating Eclipse .project file: " + projectPath.path)
            logger.trace("Creating Eclipse .classpath file: " + classpathPath.path)

            val projectBody = applyTemplates(IOUtils.toString(
              classOf[TestDeployer].getResourceAsStream("/template.project"), "UTF-8"))

            val classpathBody = applyTemplates(IOUtils.toString(
              classOf[TestDeployer].getResourceAsStream("/template.classpath"), "UTF-8"))

            projectPath.write(projectBody)(UTF8)
            classpathPath.write(classpathBody)(UTF8)

          case _ =>
        }
      }

    def deploy(): Unit = {
      logger.debug("Deploying {} ...", testProject.projectName)

      cleanDsl()
      cleanTests()

      deployDsl()
      deployGenerated()
      copyServerConfigurationTemplate()
      deployMain()
      deployTests()

      deployCompilerScript()
      deployEclipseProject()
    }

    private val projectParamTemplates = Map(
        "libPath" -> libPath.path
        , "projectRoot" -> projectRoot.path
        , "projectName" -> testProject.projectName
        , "ProjectNameCamel" -> testProject.ProjectNameCamel
        , "projectShortName" -> projectShortName
        , "javaRoot" -> languageProjectRoot(JAVA).path
        , "dbName" -> projectShortName
        , "dbHost" -> "localhost"
        , "dbPort" -> "5432"
        , "dbUser" -> "ocduser"
        , "dbPassword" -> "ocdpassword"
        , "dbOwner" -> "postgres"
        , "dbOwnerPassword" -> "ocdpassword"
        , "revenjHost" -> "localhost"
        , "revenjPort" -> projectNamesAndPortsRepository.generateProjectRevenjPort(projectShortName).toString()
        , "toolsPath" -> toolsTargetPath.path
        , "javaParent" -> javaParentBasedOnCurrentOs
        , "dslSource" -> dslSource.path
        , "revenjPath" -> revenjConfigTemplateTargetPath.path
        )

    private def applyTemplates(stringWithTemplateProperties:String):String = {
        var retVal = stringWithTemplateProperties
        for((name,value)<-projectParamTemplates){
            retVal = retVal
                    .replace("${"+name+"}", value)
                    .replace("#{"+name+"}", value)
        }
        retVal
    }

  }

  /**
   * Copy the static tools resources common to all generated projects to the target directory
   */
  private def copyStatic() {
      // Copy the tools resources
      val toolsTemplateDir = new java.io.File(classOf[TestDeployer].getResource("/template.tools").toURI());
      val toolsTargetDir = new java.io.File((toolsTargetPath).toURI);

      if (!toolsTargetPath.exists) {
          logger.trace("Creating the tools target path: " + toolsTargetPath.path)
          toolsTargetPath.createDirectory(true, false)
        }

      copyPath(toolsTemplateDir.toPath, toolsTargetDir.toPath)

      /* Copy the xsl sheets for JUnit report transformation: */
      val xslTemplateDir = new java.io.File(classOf[TestDeployer].getResource("/template.report").toURI)
      val xslTargetDir = new java.io.File((root / "report").toURI)

      copyPath(xslTemplateDir.toPath(), xslTargetDir.toPath())

      // Copy the master build.xml
      val masterReportBuilder = new java.io.File(classOf[TestDeployer].getResource("/template.master-build.xml").toURI())
      val masterReportBuilderTarget = new java.io.File((root / "build.xml").toURI)

      copyPath(masterReportBuilder.toPath(), masterReportBuilderTarget.toPath())
    }

  private def copyPath(fromPath: java.nio.file.Path, toPath: java.nio.file.Path):Unit = {
      Files.walkFileTree(fromPath, new CopyDirVisitor(logger, fromPath, toPath))
      ()
  }

  def deployTests(tests: Seq[ITestProject]): Unit = {
    val projectNamesAndPortsRepository = new ProjectNamesAndPortsRepository(logger, testSettings)
    copyStatic()
    tests.par foreach(new TestSetup(_, projectNamesAndPortsRepository).deploy())
  }
}

private class CopyDirVisitor(logger: Logger, sourcePath: java.nio.file.Path, targetPath: java.nio.file.Path) extends SimpleFileVisitor[java.nio.file.Path] {

  override def preVisitDirectory(dir: java.nio.file.Path, basicFileAttributes: BasicFileAttributes): FileVisitResult = {
    Files.createDirectories(targetPath.resolve(sourcePath.relativize(dir)))
    FileVisitResult.CONTINUE
  }

    override def visitFile(file: java.nio.file.Path, attrs: BasicFileAttributes): FileVisitResult = {

      val targetFile = targetPath.resolve(sourcePath.relativize(file))

      Files.copy(file, targetFile, StandardCopyOption.COPY_ATTRIBUTES, StandardCopyOption.REPLACE_EXISTING)

      val perms = Files.getPosixFilePermissions(file)


      /* TODO: Fix, for some reason the 'executable' permissions are never retrieved here, rendering all
       * binaries copied non-executable. As a quickfix we try a chmod in the script, but it ought to be done here.
       * An alternative would be to use the java system binaries instead of our internal copy of the JDK/JRE.*/
      if(Files.exists(targetFile)){
        Files.setPosixFilePermissions(targetFile, perms)
      }

      FileVisitResult.CONTINUE
    }
}

/**
 * A utility class that contains and stores a mapping of generated
 * project names to server ports.
 *
 * On the first run the mappings are persisted in an on-disk .properties file.
 */
private class ProjectNamesAndPortsRepository(logger: Logger, testSettings: ITestSettings){

  val propertiesSourceFile = testSettings.workspace.path / "projectNamesAndPortsRepository.properties"
  var portSequence: Int = 2000;

  private val props = new java.util.Properties()
  if(propertiesSourceFile.exists){
   props.load(new java.io.FileInputStream(propertiesSourceFile.path))
   val propsIt = props.stringPropertyNames().iterator();
   while(propsIt.hasNext()){
    val propName = propsIt.next()
    val propVal = props.getProperty(propName).toInt
    if (propVal > portSequence){
      portSequence = propVal
    }
   }
  }

  def generateProjectRevenjPort(projectDatabaseName: String) = {
    if(this.props.containsKey(projectDatabaseName)){
      this.apply(projectDatabaseName)
    }else{
      this.portSequence += 1;
      this.update(projectDatabaseName, portSequence)
      this.portSequence
    }
  }

  def update(projectDatabase:String, port:Int) = {
    props.setProperty(projectDatabase, port.toString())
    props.store(new java.io.FileOutputStream(propertiesSourceFile.path), "Generated mappings for project names to their server ports.")
  }

  def apply(key: String) = {
    props.getProperty(key).toInt
  }
}
