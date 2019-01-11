package com.dslplatform.ocd
package config

import test.javatest.{JavaInfo, TestSuiteCreator}

import scala.util.Try

class TestDeployer(
    logger: Logger
  , testSettings: ITestSettings
  ) extends ITestDeployer {

  private val rootTarget = testSettings.workspace.path
  private val toolsTemplate = testSettings.templates / "tools"
  private val toolsTarget = rootTarget / "tools"

  private val reportTemplate = testSettings.templates / "report"
  private val reportTarget = rootTarget / "report"

  private val masterBuild = testSettings.templates / "master-build"
  private val buildTemplates = testSettings.templates / "build-templates"
  private val projectBuild = testSettings.templates / "project"

  private val configTarget = toolsTarget / "config"
  private val clientConfigTemplate = testSettings.templates / "config-templates" / "java_client" / "dsl-project.properties.template"
  private val serverConfigTemplates = {
    val base = testSettings.templates / "config-templates" / s"${testSettings.revenj.templateName}-${testSettings.database.templateName}"
    testSettings.revenj.configs map { config =>
      base / config
    }
  }

  private val commonBuildTemplateName = s"build-common-template-${testSettings.revenj.templateName}-${testSettings.database.templateName}.xml"

  private val dslTemplates =  testSettings.templates / "dsl-templates"
  private val testResourcesTemplate = testSettings.templates / "test-resources"

  def deployTests(tests: Seq[ITestProject]): Unit = {
    val count = tests.size
    logger.trace(s"Deploying ${count} tests ...")
    require(NamesAndPorts.MaxNumberOfTestProjects > count, s"Increase max number of tests! Currently set to ${NamesAndPorts.MaxNumberOfTestProjects}, but tried to create ${count}")

    val namesAndPorts = new NamesAndPorts(logger, testSettings)
    copyStatic()

    tests.par foreach { test =>
      new TestSetup(test, namesAndPorts).deploy()
    }
  }

  /** Copy the static tools resources common to all generated projects to the target directory */
  private[this] def copyStatic(): Unit = {
    logger.debug("Copying the static tools and resources ...")

    cleanAndCopy(masterBuild / "build.xml", rootTarget / "build.xml")
    cleanAndCopy(masterBuild / "macrodef.xml", rootTarget / "macrodef.xml")
    cleanAndCopy(buildTemplates / commonBuildTemplateName, rootTarget / "build-common-template.xml")
    cleanAndCopy(toolsTemplate, toolsTarget)
    cleanAndCopy(reportTemplate, reportTarget)
    cleanAndCopy(clientConfigTemplate, configTarget / clientConfigTemplate.name)
    serverConfigTemplates foreach { serverConfigTemplate =>
      cleanAndCopy(serverConfigTemplate, configTarget / serverConfigTemplate.name)
    }
  }

  private def cleanAndCopy(source: File, target: File): Unit = {
    if(target.exists) {
      logger.trace("Cleaning target path: " + target.path)
      target.delete()
    }
    logger.trace(s"Copying ${source.path} to ${target.path}")
    target.parent.createDirectories()
    source.copyTo(destination = target, overwrite = true)
  }

  class TestSetup(testProject: ITestProject, namesAndPorts: NamesAndPorts) {
    private val projectRoot = rootTarget / testProject.projectPath
    private val projectShortName = testProject.projectPath.replaceAll(".*/", "")

    private val serverHost = "127.0.0.1" // [::1]
    namesAndPorts.generateProjectRevenjPort(projectShortName, serverHost)

    private val dslTarget = projectRoot / "dsl"

    private def toName(language: Language) =
      language.lowerName.replaceFirst("_.*", "")

    private def languageRoot(language: Language) =
      projectRoot / toName(language)

    private def mainRoot(language: Language) =
      languageRoot(language) / "src" / "main"

    private def mainCode(language: Language) =
      mainRoot(language) / toName(language)

    private def mainResources(language: Language) =
      mainRoot(language) / "resources"

    private def generatedRoot(language: Language) =
      languageRoot(language) / "src" / "generated"

    private def generatedCode(language: Language) =
      generatedRoot(language) / toName(language)

    private def generatedResources(language: Language) =
      generatedRoot(language) / "resources"

    private def testRoot(language: Language) =
      languageRoot(language) / "src" / "test"

    private def testResources(language: Language) =
      testRoot(language) / "resources"

    def deploy(): Unit = {
      logger.debug("Deploying {} ...", testProject.projectName)
      deployDsl()
      prepareGeneratedCodePath()
      deployTestCases()
      deployProjectFiles()
      logger.info("Deployed {}", testProject.projectName)
    }

    private def deployDsl(): Unit = {
      logger.trace("Cleaning generated DSL: {}", dslTarget.path)
      val deleted = Try(dslTarget.delete()).isSuccess
      if (!deleted) {
        logger.warn("Could not delete all generated DSL!")
      }
      val dsls = testProject.dslFiles
      if (dsls.nonEmpty) {
        logger.debug("Deploying {} DSL files to {} ...", dsls.size, dslTarget.path)
        dsls.par foreach { case (filename, body) =>
          val path = dslTarget / filename
          logger.trace("Deploying DSL: {}", path.path)
          path.write(body)
        }
      } else {
        val src = dslTemplates / "empty.dsl"
        val path = dslTarget / src.name
        logger.trace("Deploying empty DSL: {}", path.path)
        src.copyTo(path)
      }
      logger.trace("Done deploying DSL files!")
    }

    private def prepareGeneratedCodePath(): Unit = {
      logger.trace("Preparing the generated code paths ...")
      val languages = testProject.testFiles.keys

      languages foreach { language =>
        val generatedRoot = generatedCode(language)
        if (!generatedRoot.exists) {
          logger.trace("Creating the generated path: " + generatedRoot.path)
          generatedRoot.createDirectories()
        }

        val resourcePath = generatedResources(language)
        if (!resourcePath.exists) {
          logger.trace("Creating the generated resource path: " + resourcePath.path)
          resourcePath.createDirectories()
        }
      }

      languages foreach { language =>
        val mainRoot = mainCode(language)
        if (!mainRoot.exists) {
          logger.trace("Creating the main path: {}", mainRoot.path)
          mainRoot.createDirectories()
        }

        val resourcePath = mainResources(language)
        if (!resourcePath.exists) {
          logger.trace("Creating the main resource path: {}", resourcePath.path)
          resourcePath.createDirectories()
        }
      }

      logger.trace("Done preparing the generated code paths!")
    }

    private def deployTestCases(): Unit = {
      logger.trace("Cleaning tests ...")
      val languages = testProject.testFiles.keys.toSet

      languages foreach { language =>
        val path = testRoot(language)
        logger.trace(s"Cleaning ($language) tests: " + path.path)

        val deleted = Try(path.delete()).isSuccess
        if (!deleted) {
          logger.warn(s"Could not delete all code for {}!", language)
        }
      }

      testProject.testFiles foreach { case (language, files) =>
        val testRootForLanguage = testRoot(language)
        logger.debug("Deploying {} tests to {} ...", testProject.testFiles.values.map(_.size).sum, testRootForLanguage.path)

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
          val path = testRootForLanguage / filename
          logger.trace("Deploying test: {}", path.path)
          path.write(Patches.fixTests(body))
        }

        logger.trace("Deploying test resources ...")
        val testResourcesPath = testResources(language)
        testResourcesTemplate.listRecursively foreach { testResource =>
          logger.trace("Deploying test resource: {}", testResource.path)
          copyTemplate(testResource, testResourcesPath / testResource.name)
        }
      }
    }

    private def deployProjectFiles(): Unit =
      testProject.testFiles.keys foreach { case language =>
        logger.trace("Deploying project files for language: {}", language)
        val langRoot = languageRoot(language)
        language match {
          case JAVA =>
            copyTemplate(projectBuild / ".project", langRoot / ".project")
            copyTemplate(projectBuild / ".classpath", langRoot / ".classpath", jarExpansion)
//            copyTemplate(projectBuild / ".pgpass", langRoot / ".pgpass")
            copyTemplate(projectBuild / "build.xml", langRoot / "build.xml")
          case _ =>
        }
      }

    private def copyTemplate(source: File, target: File, process: String => String = templateApplication) = {
      logger.trace(s"Creating the ${source.name} script: {}", target.path)
      val body = process(source.contentAsString)
      target write body
    }

    private val projectParamTemplates = Map(
      "projectName" -> testProject.projectName
    , "ProjectNameCamel" -> testProject.ProjectNameCamel
    , "projectShortName" -> projectShortName
    )

    private val templateApplication = (stringWithTemplateProperties: String) =>
      (projectParamTemplates :\ stringWithTemplateProperties) { case ((name, value), retVal) => retVal
        .replace("#{" + name + ":escape}", value.replaceAll("([#!:=])", "\\\\$1"))
        .replace("#{" + name + "}", value)
      }

    private val JarExpansionPattern = """(.*?path=")(.*)/\*\*\.jar(".*)""".r
    private val jarExpansion = (classpathWithTemplateProperties: String) => {
      if ((classpathWithTemplateProperties indexOf '\r') != -1) {
        sys.error("Windows newline found in project settings!")
      }
      val expanded = (classpathWithTemplateProperties.split("\n") map {
        case JarExpansionPattern(before, path, after) =>
          val pathFix = path match {
            case "testing" => "../../../tools/testing"
            case "compile/java_client" => "temp/client/dependencies"
            case "compile/revenj.java" => "temp/server/dependencies"
            case other => sys.error("Unknown classpath reference: " + other)
          }
          ((toolsTemplate / path).list(_.extension.contains("jar")).toSeq map { jar =>
            before + pathFix + '/' + jar.name + after
          }).sorted.mkString("\n")
        case line =>
          line
      }).mkString("\n")

      templateApplication(expanded)
    }
  }
}
