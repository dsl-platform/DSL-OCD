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

class TestJavaPropertyGetterTypeTurtle
    extends ITestProject {

  def projectPath = "turtles/getters"
  def projectName = "OCD Java Property Getter Tests"

  def dslFiles = Map.empty
  def testFiles = Map(
    JAVA -> (for (oj <- OcdJava.values) yield {
      JavaInfo(makeTemplate(oj).testBody).toEntry
    }).toMap
  )

  private def makeTemplate(oj: OcdJava) = {
    val name = oj.boxName + (if (oj.areElementsNullable.isEmpty) oj.typeSingleName else oj.typePluralName)
    val _testName = s"${name}GetterTurtle"

    val getterTests =
      for {
        vis <- Visibility.values
        mods <- Modifier.methodCombinations
      } yield {
        new TestJavaPropertyGetterType {
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
        """SuppressWarnings({ "rawtypes", "unchecked" })"""
      )

      override def leadingBlocks = getterTests map { test =>
        val visibility =
          test.visibility.javaFieldPrefix

        val modifiers = test.modifiers.map(_.javaFieldPrefix).mkString
        val clazz = test.propertyType.javaClass

        s"""
    ${visibility}${modifiers}${clazz} get${test.propertyName.fciu}() {
        return ${test.propertyType.defaultValue};
    }
"""
      }

      def tests: Seq[TestComponent] = getterTests
    }
  }
}
