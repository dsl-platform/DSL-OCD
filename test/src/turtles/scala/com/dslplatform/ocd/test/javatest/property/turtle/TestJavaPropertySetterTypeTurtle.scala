package com.dslplatform.ocd
package test
package javatest
package property
package turtle

import config._
import javas._

object TestJavaPropertySetterTypeTurtle
    extends ITestProject {

  def projectPath = "turtles/setters"
  def projectName = "OCD Java Property Setter Type Tests"

  def dslFiles = Map.empty
  def testFiles = Map(
    JAVA -> (for (ojbt <- OcdJavaBoxType.values) yield {
      JavaInfo(makeTemplate(ojbt).testBody).toEntry
    }).toMap
  )

  private def makeTemplate(ojbt: OcdJavaBoxType) = {
    val name = ojbt.javaDescription
    val _testName = s"${name}SetterTurtle"

    val setterTests =
      for {
        vis <- Visibility.values
        mods <- Modifier.methodCombinations
      } yield {
        ojbt -> new TestJavaPropertySetterType {
          def conceptName = _testName
          def property = OcdJavaProperty(name.fcil + vis + mods.mkString, ojbt)
          def visibility = vis
          def modifiers = mods
        }
      }

    new TestJavaTemplate {
      def packageName = "com.dslplatform.ocd.test.javatest.property.turtles." + ojbt.typeSingleName
      def testName = _testName

      override def leadingBlocks = setterTests map { case (ojbt, test) =>
        val visibility = test.visibility.javaFieldPrefix
        val modifiers = test.modifiers.map(_.javaFieldPrefix).mkString
        val clazz = ojbt.javaClass
        val name = test.property.propertyName
        val value = ojbt.defaultValue

        s"""
    ${visibility}${modifiers}${testName} set${name.fciu}(final ${clazz} ${name}) {
        return null;
    }
"""
      }

      def tests: Seq[TestComponent] = setterTests.map(_._2)
    }
  }
}
