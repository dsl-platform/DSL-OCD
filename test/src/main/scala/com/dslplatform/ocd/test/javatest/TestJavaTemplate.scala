package com.dslplatform.ocd
package test
package javatest

trait TestJavaTemplate {
  def packageName: String
  def testName: String

  def imports: Seq[String] = Nil
  def classDecorations: Seq[String] = Nil

  def leadingBlocks: Seq[String] = Nil
  def tests: Seq[test.TestComponent]

  def isSuite = this match { case _: TestSuiteCreator => true; case _ => false }

  def testBody = {
    val sb = new StringBuilder

    sb ++= "package " ++= packageName ++= ";\n\n"

    if (imports.nonEmpty) {
      val withLogging = imports ++ (if (isSuite) Nil else Seq(
        "org.slf4j.Logger"
      , "org.slf4j.LoggerFactory"
      , "org.slf4j.MDC"
      ))

      val sorted = withLogging.distinct.sortBy(identity)

      sorted foreach { imp =>
        sb ++= "import " ++= imp ++= ";\n"
      }

      sb += '\n'
    }

    classDecorations foreach { cd =>
      sb += '@' ++= cd += '\n'
    }
    sb ++= "public class " ++= testName ++=" {\n"

    if (!isSuite) {
      sb ++= """    private static Logger anchorLogger;

    @org.junit.BeforeClass
    public static void initializeLogging() {
        anchorLogger = LoggerFactory.getLogger("ocd-anchor-logger");
    }

"""
    }

    leadingBlocks foreach { test =>
      sb ++= test
    }


    /* Quick and filthy regex replace to inject some logging, for easier report creation.
     * The reason we're putting html here, is because otherwise the heap space in the XSLT transformer
     * goes up too quickly, and the transform breaks. */
    tests foreach { test =>
      sb ++= test.testComponentBody.replaceAll(
          """public[ ]+void[ ]+test([^\(]+)\(\)(.*?)\{"""
        , s"""public void test$$1()$$2{
        final String thisTest = "$packageName.$testName.test$$1";
        anchorLogger.trace("<a id='" + thisTest + "'><h4>" + thisTest + "</h4></a>");
        MDC.put("ocdTestMethodName", "test$$1:");
""")
    }

    sb ++= "}\n" toString
  }
}
