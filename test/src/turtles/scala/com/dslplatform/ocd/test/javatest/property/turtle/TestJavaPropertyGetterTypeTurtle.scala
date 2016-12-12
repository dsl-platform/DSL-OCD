package com.dslplatform.ocd
package test
package javatest
package property
package turtle

import config._
import javas._

class TestJavaPropertyGetterTypeTurtle(testSettings: ITestSettings)
    extends ITestProject {

  def projectPath = "turtles/getters"
  def ProjectNameCamel = "PropertyGetterTypeTurtle"
  def projectName = "OCD Java Property Getter Type Turtle"

  def dslFiles = Map.empty
  def testFiles = Map(
    JAVA -> (for (ojbt <- OcdJavaBoxType.useCaseValues(testSettings)) yield {
      JavaInfo(makeTemplate(ojbt).testBody).toEntry
    }).toMap
  )

  private def makeTemplate(ojbt: OcdJavaBoxType) = {
    val name = ojbt.javaDescription
    val _testName = s"${name}GetterTurtle"

    val getterTests =
      for {
        vis <- Visibility.values
        mods <- Modifier.methodCombinations
      } yield {
        ojbt -> new TestJavaPropertyGetterType {
          def conceptName = _testName
          def property = OcdJavaBoxTypeProperty(name.fcil + vis + mods.mkString, ojbt)
          def visibility = vis
          override def modifiers = mods
        }
      }

    new TestJavaTemplate {
      def packageName = "com.dslplatform.ocd.test.javatest.property.turtles." + ojbt.typeSingleName
      def testName = _testName

      override def imports = Seq(
        "org.slf4j.Logger"
      )

      override def leadingBlocks = getterTests map { case (ojbt, test) =>
        val visibility = test.visibility.javaFieldPrefix
        val modifiers = test.modifiers.map(_.javaFieldPrefix).mkString
        val clazz = ojbt.javaClass
        val name = test.property.name.fciu
        val value = ojbt.defaultValue

        s"""
    ${visibility}${modifiers}${clazz} get${name}() {
        return ${value};
    }
"""
      }

      def tests = getterTests.map(_._2)
    }
  }
}
