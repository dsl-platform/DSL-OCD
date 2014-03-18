package com.dslplatform.ocd
package test
package javatest

trait TestJavaTemplate {
  def packageName: String
  def testName: String

  def imports: Seq[String] = Nil
  def classDecorations: Seq[String] = Nil
  def leadingTests: Seq[String] = Nil

  def tests: Seq[test.TestComponent]

  def testBody = {
    val sb = new StringBuilder

    sb ++= s"package $packageName;\n\n"

    if (imports.nonEmpty) {
      imports foreach { imp =>
        sb ++= "import " + imp + ";\n"
      }

      sb += '\n'
    }

    classDecorations foreach { cd =>
      sb ++= cd + '\n'
    }
    sb ++= s"public class ${testName} {\n"

    leadingTests foreach { test =>
      sb ++= test
    }

    tests foreach { test =>
      sb ++= test.testComponentBody
    }

    sb ++= "}\n"
    sb.toString
  }
}
