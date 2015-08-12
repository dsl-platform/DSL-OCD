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
      val sorted = imports.distinct.sorted
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
      sb ++= s"""    private static org.slf4j.Logger anchorLogger;

    @org.junit.BeforeClass
    public static void initializeLogging() {
        anchorLogger = org.slf4j.LoggerFactory.getLogger("ocd-anchor-logger");
    }

    @org.junit.Rule
    public final org.junit.rules.TestName testName = new org.junit.rules.TestName();

    @org.junit.Before
    public void openLoggingContext() {
        final String methodName = testName.getMethodName();
        final String methodPath = getClass().getName() + "." + methodName;
        anchorLogger.trace("<a id=\\"" + methodPath + "\\"><h4>" + methodPath + "</h4></a><tt>");
        org.slf4j.MDC.put("ocdTestMethodName", methodName);
    }

    @org.junit.After
    public void closeLoggingContext() {
        anchorLogger.trace("</tt>");
    }
"""
    }

    leadingBlocks foreach { test =>
      sb ++= test
    }

    tests foreach { test => sb ++= test.testComponentBody }

    sb ++= "}\n" toString
  }
}
