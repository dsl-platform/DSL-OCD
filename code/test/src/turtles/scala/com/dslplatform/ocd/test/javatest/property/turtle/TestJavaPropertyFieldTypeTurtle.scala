package com.dslplatform.ocd
package test
package javatest
package property
package turtle

import javas.OcdJava

import config._
import test._
import javatest._
import property._

class TestJavaPropertyFieldTypeTurtle
    extends ITestProject {

  def projectPath = "turtles/fields"
  def projectName = "OCD Java Property Field Tests"

  def dslFiles = Map.empty
  def testFiles = Map(
    JAVA -> (for (oj <- OcdJava.values) yield {
      JavaInfo(makeTemplate(oj).testBody).toEntry
    }).toMap
  )

  private def makeTemplate(oj: OcdJava) = {
    val name = oj.boxName + (if (oj.areElementsNullable.isEmpty) oj.typeSingleName else oj.typePluralName)
    val _testName = s"${name}FieldTurtle"

    val fieldTests =
      for {
        vis <- Visibility.values
        mods <- Modifier.fieldCombinations
      } yield {
        new TestJavaPropertyFieldType {
          def conceptName = _testName
          def propertyName = name.fcil + vis + mods.mkString
          def propertyType = oj
          def visibility = vis
          def modifiers = mods
        }
      }

    new TestJavaTemplate {
      def packageName = "com.dslplatform.ocd.test.javatest.property.turtles." + oj.typeSingleName
      def testName = _testName

      override def leadingBlocks = fieldTests map { test =>
        val visibility =
          (if (test.visibility == Visibility.Private) """@SuppressWarnings("unused") """ else "") +
          test.visibility.javaFieldPrefix

        val modifiers = test.modifiers.map(_.javaFieldPrefix).mkString
        val clazz = test.propertyType.javaClass

        s"""
    ${visibility}${modifiers}${clazz} ${test.propertyName} = ${test.propertyType.defaultValue};
"""
      }

      def tests: Seq[TestComponent] = fieldTests
    }
  }
}
