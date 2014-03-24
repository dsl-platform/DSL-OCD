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

class TestJavaPropertySetterTypeTurtle
    extends ITestProject {

  def projectPath = "turtles/setters"
  def projectName = "OCD Java Property Setter Tests"

  def dslFiles = Map.empty
  def testFiles = Map(
    JAVA -> (for (oj <- OcdJava.values) yield {
      JavaInfo(makeTemplate(oj).testBody).toEntry
    }).toMap
  )

  private def makeTemplate(oj: OcdJava) = {
    val name = oj.boxName + (if (oj.areElementsNullable.isEmpty) oj.typeSingleName else oj.typePluralName)
    val _testName = s"${name}SetterTurtle"

    val setterTests =
      for {
        vis <- Visibility.values
        mods <- Modifier.methodCombinations
      } yield {
        new TestJavaPropertySetterType {
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

      override def classDecorations = Seq(
        """SuppressWarnings({ "rawtypes", "unchecked", "unused" })"""
      )

      override def leadingBlocks = setterTests map { test =>
        val visibility =
          test.visibility.javaFieldPrefix

        val modifiers = test.modifiers.map(_.javaFieldPrefix).mkString
        val clazz = test.propertyType.javaClass

        s"""
    ${visibility}${modifiers}${testName} set${test.propertyName.fciu}(final ${clazz} ${test.propertyName}) {
        return null;
    }
"""
      }

      def tests: Seq[TestComponent] = setterTests
    }
  }
}
