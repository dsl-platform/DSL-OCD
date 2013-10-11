package com.dslplatform.ocd
package setup

private[setup] class TestDeployer(
    logger: Logger
  ) extends ITestDeployer {

  private def cleanDsl() {}
  private def cleanCode() {}
  private def cleanTests() {}

  def deployDsl(dslFiles: Map[String, String]) = {}
  def deployCode(codeFiles: Map[String, String]) = {}
  def deployTests(testsFiles: Map[String, String]) = {}

  def deployTests(tests: Seq[ITestSetup]) = {
    tests foreach { curTest =>
      val dslFiles = curTest.test.dslFiles
      val testFiles = curTest.test.testFiles
      val codeFiles = curTest.codeFiles
    }
  }
}
//class TestProjectLoader(
//    logger: Logger) {
//
//  def load(path: String) = {
//    val project = new ITestProject() {
//      logger.debug("Initializing test project at " + path)
//      val root = Path(path.replace('\\', '/'), '/')
//
//      private val dsl = root / "dsl"
//      private val code = root / "src" / "generated"
//      private val tests = root / "src" / "test" / "java"
//
//      private def cleanDsl() {
//        logger.debug("Cleaning generated DSL ...")
//        val remaining = dsl.deleteRecursively(true, true)._2
//        if (remaining > 0) {
//          logger.warn(s"Could not delete all generated DSL ($remaining)!")
//        }
//      }
//
//      private def cleanCode() {
//        logger.debug("Cleaning compiled code ...")
//        val remaining = code.deleteRecursively(true, true)._2
//        if (remaining > 0) {
//          logger.warn(s"Could not delete all compiled code ($remaining)!")
//        }
//      }
//
//      private def cleanTests() {
//        logger.debug("Cleaning generated tests ...")
//        val remaining = tests.deleteRecursively(true, true)._2
//        if (remaining > 0) {
//          logger.warn(s"Could not delete all generated tests ($remaining)!")
//        }
//      }
//
//      def clean() {
//        cleanDsl()
//        cleanCode()
//        cleanTests()
//      }
//
//      def deployDsl(dslFiles: Map[String, String]) =
//        dslFiles foreach { case (filename, body) =>
//          logger.trace("Deploying DSL: " + filename)
//          (dsl / (filename, '/')).write(body)
//        }
//
//      def deployCode(codeFiles: Map[String, String]) =
//        codeFiles foreach { case (filename, body) =>
//          logger.trace("Deploying code: " + filename)
//          (code / (filename, '/')).write(body)
//        }
//
//      def deployTests(testFiles: Map[String, String]) =
//        testFiles foreach { case (filename, body) =>
//          logger.trace("Deploying test: " + filename)
//          (tests / (filename, '/')).write(body)
//        }
//
//      logger.info("Initialized test project!")
//    }
//
//    project
//  }
