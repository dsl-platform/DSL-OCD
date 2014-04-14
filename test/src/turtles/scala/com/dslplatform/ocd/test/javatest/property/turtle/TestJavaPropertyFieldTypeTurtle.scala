package com.dslplatform.ocd
package test
package javatest
package property
package turtle

import config._
import javas._

object TestJavaPropertyFieldTypeTurtle
    extends ITestProject {

  def projectPath = "turtles/fields"
  def projectName = "OCD Java Property Field Type Turtle"

  def dslFiles = Map.empty
  def testFiles = Map(
    JAVA -> (for (ojbt <- OcdJavaBoxType.values) yield {
      JavaInfo(makeTemplate(ojbt).testBody).toEntry
    }).toMap
  )

  private def makeTemplate(ojbt: OcdJavaBoxType) = {
    val name = ojbt.javaDescription
    val _testName = s"${name}FieldTurtle"

    val fieldTests =
      for {
        vis <- Visibility.values
        mods <- Modifier.fieldCombinations
      } yield {
        ojbt -> new TestJavaPropertyFieldType {
          def conceptName = _testName
          def property = OcdJavaBoxTypeProperty(name.fcil + vis + mods.mkString, ojbt)
          def visibility = vis
          override def modifiers = mods
        }
      }

    new TestJavaTemplate {
      def packageName = "com.dslplatform.ocd.test.javatest.property.turtles." + ojbt.typeSingleName
      def testName = _testName

      override def leadingBlocks = fieldTests map { case (ojbt, test) =>
        val visibility = test.visibility.javaFieldPrefix
        val modifiers = test.modifiers.map(_.javaFieldPrefix).mkString
        val clazz = ojbt.javaClass
        val name = test.property.name
        val value = ojbt.defaultValue

        s"""
    ${visibility}${modifiers}${clazz} ${name} = ${value};
"""
      }

      def tests = fieldTests.map(_._2)
    }
  }
}
