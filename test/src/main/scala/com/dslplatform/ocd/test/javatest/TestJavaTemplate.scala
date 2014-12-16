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

  def testBody = {
    val sb = new StringBuilder

    sb ++= "package " ++= packageName ++= ";\n\n"

    if (imports.nonEmpty) {
      imports foreach { imp =>
        sb ++= "import " ++= imp ++= ";\n"
      }

      sb += '\n'
    }

    classDecorations foreach { cd =>
      sb += '@' ++= cd += '\n'
    }
    sb ++= "public class " ++= testName ++=" {\n"

    leadingBlocks foreach { test =>
      sb ++= test
    }

    /* Quick and filthy regex replace to inject some logging, for easier report creation */
    tests foreach { test =>
      sb ++= test.testComponentBody.trim()
          .replaceAll(
              "public[ ]+void[ ]+test([^\\(]+)\\(\\)(.*)\\{"
              ,"""public void test$1()$2{
              org.slf4j.LoggerFactory.getLogger("ocd-anchor-logger").trace("OCD-OPEN-ANCHOR-BEGIN test$1 OCD-OPEN-ANCHOR-END"\);
              org.slf4j.MDC.put("ocdTestMethodName","test$1:");
              """)
          ;
    }

    sb ++= "}\n" toString
  }
}
