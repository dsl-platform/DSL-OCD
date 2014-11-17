package com.dslplatform.ocd
package config

import scalax.io.Codec.UTF8
import scala.collection.mutable.LinkedHashMap
import test.javatest.TestSuiteCreator
import test.javatest.JavaInfo
import org.apache.commons.io.IOUtils
import org.apache.commons.io.FileUtils

/**
 * A utility class that contains and stores a mapping of generated
 * project names to server ports.
 *
 * On the first run the mappings are persisted in an on-disk .properties file.
 */
private class ProjectNamesToPorts(logger: Logger, testSettings: ITestSettings){

  val propertiesSourceFile = testSettings.workspace.path / "projectNamesToPorts.properties"
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

  class TestSetup(testProject: ITestProject, projectNamesToPorts : ProjectNamesToPorts) {

    private val projectRoot = root / (testProject.projectPath, '/')

    // TODO: Add this as another property to ITestProject, this is just a tmp workaround since
    // such a change would require a lot of modifications on many places
    private val projectDatabaseName = testProject.projectPath.replaceAll(".*/","")

    private val projectRevenjPort = projectNamesToPorts.generateProjectRevenjPort(projectDatabaseName);

    private val commonsPath =
      projectRoot / "commons"

    private val configPath =
      commonsPath / "config"

    private val clientRoot =
      projectRoot / "client"

    private val serverRoot =
      projectRoot / "server"

    private val revenjTargetPath =
      projectRoot / "revenj"

    private val dslPath =
      clientRoot / "dsl"

    private val DSL_PROJECT_INI = "dsl-project.ini"

    private def languagePath(language: Language) =
      clientRoot / language.language.toLowerCase

    private def generatedPath(language: Language) =
      languagePath(language) / "src" / "generated"

    private def generatedResourcePath(language: Language) =
      generatedPath(language) / "resources"

    private def generatedIniPath(language: Language) =
      generatedResourcePath(language) / DSL_PROJECT_INI

    private def mainPath(language: Language) =
      languagePath(language) / "src" / "main"

    private def mainResourcePath(language: Language) =
      mainPath(language) / "resources"

    private def testPath(language: Language) =
      languagePath(language) / "src" / "test"

    private def testResourcePath(language: Language) =
      testPath(language) / "resources"

    private def testIniPath(language: Language) =
      testResourcePath(language) / DSL_PROJECT_INI

    private def cleanDsl(): Unit = {
      logger.debug("Cleaning generated DSL ...")
      logger.trace("Deleting: " + dslPath.path)

      val remaining = dslPath.deleteRecursively(true, true)._2
      if (remaining > 0) {
        logger.warn(s"Could not delete all generated DSL ($remaining)!")
      }
    }

    private def deployDsl(): Unit = {
      val dsls = testProject.dslFiles

//      if (dsls.nonEmpty) {
//        val emptyPath = dslPath / "empty.dsl"
//        logger.trace("Deploying empty DSL: " + emptyPath.path)
//        emptyPath.write(IOUtils.toByteArray(
//                classOf[TestDeployer].getResourceAsStream("/empty.dsl")))
//      }

      dsls.par foreach { case (filename, body) =>
        val path = dslPath / (filename, '/')
        logger.trace("Deploying DSL: " + path.path)
        path.write(body)
      }
    }

    private def deployCommons(): Unit = {
      if (!commonsPath.exists) {
        logger.trace("Creating the common files path: " + commonsPath.path)
        commonsPath.createDirectory(true, false)
      }

      {
        if (!configPath.exists) {
          logger.trace("Creating the configuration files path: " + configPath.path)
          configPath.createDirectory(true, false)
        }

        val path = configPath / "dsl.props"
        logger.trace("Deploying the dsl.props file: " + path.path)

        val body = IOUtils.toString(
          classOf[TestDeployer].getResourceAsStream("/template.dsl.props"))
          .replace("${projectDatabaseName}", projectDatabaseName)
          .replace("${projectPort}", projectRevenjPort.toString());

        // TODO: replace configuration params to match this specific project settings

        path.write(body)
      }
    }

    private def deployServer(): Unit = {
      // Copy the server resources

      val revenjTemplateDir = new java.io.File(classOf[TestDeployer].getResource("/template.revenj").toURI());
      val revenjTargetDir = new java.io.File(revenjTargetPath.toURI);

      if (!revenjTargetPath.exists) {
          logger.trace("Creating the revenj target path: " + revenjTargetPath.path)
          revenjTargetPath.createDirectory(true, false)
        }

      FileUtils.copyDirectory(revenjTemplateDir, revenjTargetDir);

      val revenjConfig = IOUtils.toString(
                classOf[TestDeployer].getResourceAsStream(
                    "/template.revenj/Revenj.Http.exe.config"))
                .replace("${projectDatabaseName}", projectDatabaseName)
                .replace("${projectPort}", projectRevenjPort.toString());

      val revenjConfigTargetPath = revenjTargetPath / "Revenj.Http.exe.config"
      logger.trace("Writing the revenj configuration at: " + revenjConfigTargetPath.path);
      revenjConfigTargetPath.write(revenjConfig)(UTF8)

      ()
    }

    private def deployGenerated(): Unit =
      testProject.testFiles foreach { case (language, files) =>
        val generatedRoot = generatedPath(language) / language.language.toLowerCase
        if (!generatedRoot.exists) {
          logger.trace("Creating the generated path: " + generatedRoot.path)
          generatedRoot.createDirectory(true, false)
        }

        val resourcePath = generatedResourcePath(language)
        if (!resourcePath.exists) {
          logger.trace("Creating the generated resource path: " + resourcePath.path)
          resourcePath.createDirectory(true, false)
        }

        /* TODO: See for .ini if it's at all neccessary, or for the tests .ini from testIniPath is used (the one called 'template.dsl-project.ini').
         * If so, this probably needs to be deleted, and replace with the other .ini file. */
        val projectIniPath = generatedIniPath(language)
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
        val mainRoot = mainPath(language) / language.language.toLowerCase
        if (!mainRoot.exists) {
          logger.trace("Creating the main path: " + mainRoot.path)
          mainRoot.createDirectory(true, false)
        }

        val resourcePath = mainResourcePath(language)
        if (!resourcePath.exists) {
          logger.trace("Creating the main resource path: " + resourcePath.path)
          resourcePath.createDirectory(true, false)
        }
      }

    private def cleanTests(): Unit = {
      val languages = testProject.testFiles.keys.toSet

      languages foreach { language =>
        logger.debug(s"Cleaning tests ($language) ...")
        val path = testPath(language)
        logger.trace("Deleting: " + path.path)

        val remaining = path.deleteRecursively(true, true)._2
        if (remaining > 0) {
          logger.warn(s"Could not delete all code for $language ($remaining)!")
        }
      }
    }

    private def deployTests(): Unit =
      testProject.testFiles foreach { case (language, files) =>
        val languageRoot = testPath(language)

        val classes = files.values.map(JavaInfo(_).classPath).toIndexedSeq.sorted
        val suite = JavaInfo(
          new TestSuiteCreator {
            def packageName = "com.dslplatform.ocd.test"
            def testName = "TestEntryPoint"
            def testClasses = classes
          } testBody
        )

        val suiteWithTests = files + suite.toEntry

        suiteWithTests.par foreach { case (filename, body) =>
          val path = languageRoot / (filename, '/')
          logger.trace("Deploying test: " + path.path)
          path.write(Patches.fixTests(body))
        }

        val resourcePath = testResourcePath(language)
        logger.trace("Creating the test resource path: " + resourcePath.path)
        resourcePath.createDirectory(true, false)

        {
          val resourceLogback = resourcePath / "logback-test.xml"
          logger.trace("Writing logback-test.xml: " + resourceLogback.path)
          val logbackBody = IOUtils.toByteArray(
                classOf[TestDeployer].getResourceAsStream("/template.logback-test.xml"))
          resourceLogback.write(logbackBody)
        }
        {
          val resourceDslProjectIni = testIniPath(language)
          logger.trace(s"Writing $DSL_PROJECT_INI: " + resourceDslProjectIni.path)
          val dslProjectIniBody = IOUtils.toString(
                classOf[TestDeployer].getResourceAsStream(s"/template.$DSL_PROJECT_INI"))
                .replace("${projectPort}", projectRevenjPort.toString());
          resourceDslProjectIni.write(dslProjectIniBody)
        }
      }

    private def deployCompilerScript(): Unit =

      /* TODO: copy these not to root but to project category root (aggregates, snowflakes, values)
       * atm these are hard-coded in individual test generators */
//      copyTemplate("compile_all.sh", root)
//      copyTemplate("deploy_all.sh",  root)

      testProject.testFiles.keys foreach { case language =>
        val languageRoot = languagePath(language)
        language match {
          case JAVA =>
            {
                copyTemplate("compiler.bat", projectRoot);
                copyTemplate("compiler.sh", projectRoot);
                copyTemplate("runRevenj.sh", projectRoot);
                copyTemplate("create_database.sh", projectRoot);
                copyTemplate("compile_dsls.sh", projectRoot);
            }
          case _ =>
        }
      }

    private def copyTemplate(scriptName: String, target: Path) = {
        {
            val path = target / scriptName
            logger.trace("Creating the "+ scriptName +" script: " + path.path)

            val body = IOUtils.toString(
              classOf[TestDeployer].getResourceAsStream("/template."+scriptName))
                .replace("${projectDatabaseName}", projectDatabaseName)
                .replace("${projectPort}", projectRevenjPort.toString)
                .replace("${toolsPath}", toolsTargetPath.path);

            path.write(body)
        }
    }

    private def deployEclipseProject(): Unit =
      testProject.testFiles.keys foreach { case language =>
        val languageRoot = languagePath(language)

        language match {
          case JAVA =>
            val projectPath = languageRoot / ".project"
            val classpathPath = languageRoot / ".classpath"

            logger.trace("Creating Eclipse .project file: " + projectPath.path)
            logger.trace("Creating Eclipse .classpath file: " + classpathPath.path)

            val projectBody = IOUtils.toString(
              classOf[TestDeployer].getResourceAsStream("/template.project"), "UTF-8")
              .replace("${projectName}", testProject.projectName)

            val libPath = testSettings.workspace.path / ".." / "tools" / "java" / "lib"
            val classpathBody = IOUtils.toString(
              classOf[TestDeployer].getResourceAsStream("/template.classpath"), "UTF-8")
              .replace("${libPath}", libPath.path)

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
      deployCommons()
      deployServer()
      deployMain()
      deployTests()

      deployCompilerScript()
      deployEclipseProject()
    }
  }

  /**
   * Copy the static tools resources from the resource directory to the target path
   */
  private def copyTools(): Unit = {
      // Copy the tools resources
      val toolsTemplateDir = new java.io.File(classOf[TestDeployer].getResource("/template.tools").toURI());
      val toolsTargetDir = new java.io.File((toolsTargetPath).toURI);

      if (!toolsTargetPath.exists) {
          logger.trace("Creating the tools target path: " + toolsTargetPath.path)
          toolsTargetPath.createDirectory(true, false)
        }

      FileUtils.copyDirectory(toolsTemplateDir, toolsTargetDir);
    }

  def deployTests(tests: Seq[ITestProject]): Unit = {
    val projectNamesToPorts = new ProjectNamesToPorts(logger, testSettings)
    copyTools()
    tests.par foreach(new TestSetup(_, projectNamesToPorts).deploy())
  }
}
