package com.dslplatform.ocd
package `test.javas`

trait TestJavaTemplate {
  def packageName: String
  def testName: String

  def imports: Seq[String] = Nil
  def staticFields: Seq[String] = Nil
  def beforeClass: Seq[String] = Nil
  def afterClass: Seq[String] = Nil
  def beforeTest: Seq[String] = Nil
  def afterTest: Seq[String] = Nil
  def helperMethods: Seq[String] = Nil

  def tests: Seq[TestJavaComponent]

  def testBody = {
    val sb = new StringBuilder

    sb ++= s"package $packageName;\n\n"

    if (imports.nonEmpty) {
      imports foreach { imp =>
        sb ++= "import " + imp + ";\n"
      }

      sb += '\n'
    }

    sb ++= s"public class ${testName} {\n"

    tests foreach { test =>
      sb ++= test.testComponentBody
    }

    sb ++= "}\n"
    sb.toString
  }
}
