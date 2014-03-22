//package com.dslplatform.ocd
//package config
//
//import com.dslplatform.compiler.client.api.Actions
//import com.dslplatform.compiler.client.api.ApiCall
//import com.dslplatform.compiler.client.api.params.Credentials
//import com.dslplatform.compiler.client.api.params.ProjectName
//import com.dslplatform.compiler.client.cmdline.logger.LoggerSLF4J
//import com.dslplatform.ocd.test.UniqueNames
//
//private[config] class TestGenerator(
//    logger: Logger
//  , testSettings: ITestSettings
//  , actions: IApiActions
//  ) extends ITestGenerator {
//
//  def generateTests(
//      _testName: String
//    , tests: Seq[ITest]) = {
//    val projectName = {
//      val timestamp = testSettings.xkcd.time
//      "Test_%s_%04d" format(
//        timestamp.replace('-', '_')
//      , UniqueNames.nextInt(timestamp)
//      )
//    }
//
//    logger.info("Creating the generator project ...")
//    val _packageName = tests.head.packageName.ensuring(pn =>
//      tests.tail.forall(_.packageName == pn)
//    , "All package names within a test batch must be equal!"
//    )
//
//    val _projectIni = actions.create(projectName, _packageName)
//    val _tests = tests
//    val _languages = tests.flatMap(_.testFiles.keySet).toSet
//    val _dslFiles = tests.flatMap(_.dslFiles).toMap
//
//    logger.info("Generating sources ...")
//
//    val _codeFiles =
//      actions.deployDsl(
//        projectID = _projectIni.projectID
//      , packageName = _packageName
//      , languages = _languages
//      , dslFiles = _dslFiles
//      )
//
//    val testSetup =
//      new ITestSetup {
//        def testName = _testName
//        def projectIni = _projectIni
//        def tests = _tests
//        def codeFiles = _codeFiles
//      }
//
////    logger.info("Deleting the generator project ...")
////    actions.delete(_projectIni.projectID)
//
//    testSetup
//  }
//}
