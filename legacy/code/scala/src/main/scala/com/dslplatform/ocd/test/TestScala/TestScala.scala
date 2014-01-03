package com.dslplatform.ocd
package test
package TestScala

import scala.collection.immutable.TreeSet

trait TestScala
    extends types.OcdTest {
  def testBody: String
}

trait TestComponentScala {
  def imports: Seq[String]
  def testComponentBody: String
}

private object TestScalaTemplate {
  private def cleanup(text: String) = {
    val trims = (_: String)
      .trim
      .replaceAll("(\n\n)\n+", "$1")
      .replaceAll("(\\{\n)\n+", "$1")
      .replaceAll("\n+(\n *\\})", "$1")

    (trims)(text) + "\n"
  }
}

trait TestScalaTemplate
    extends TestScala {

  def packageName: String
  def testName: String

  def testComponents: Seq[TestComponentScala]
  def testComponentsString =
    testComponents.map(_.testComponentBody).mkString

  def imports: Seq[String]
  def importsString = (
      TreeSet(
        "org.scalatest._"
      , "com.dslplatform.api.patterns.ServiceLocator"
      ) ++ imports
      ++ testComponents.flatMap(_.imports)
    ) map("import "+) mkString("\n")

  def testBody = TestScalaTemplate.cleanup(s"""
package ${packageName}

${importsString}

class ${testName} extends SpecExtensions {
${testComponentsString}
}

""")
}
