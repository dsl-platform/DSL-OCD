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

    tests foreach { test =>
      sb ++= test.testComponentBody
    }

    sb ++= "}\n" toString
  }
}
