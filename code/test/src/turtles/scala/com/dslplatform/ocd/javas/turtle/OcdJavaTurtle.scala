package com.dslplatform.ocd
package javas
package turtle

import config._
import test._
import javatest._

class OcdJavaTurtle
    extends ITestProject {

  def projectPath = "turtles/defaults"
  def projectName = "OCD Java Defaults Turtle"

  def dslFiles = Map.empty
  def testFiles = Map(
    JAVA -> (for (oj <- OcdJava.values) yield {
      JavaInfo(makeTemplate(oj).testBody).toEntry
    }).toMap
  )

  private def makeTemplate(oj: OcdJava) = {
    val name = oj.boxName + (if (oj.areElementsNullable.isEmpty) oj.typeSingleName else oj.typePluralName)
    val _testName = s"${name}FieldTurtle"

    new TestJavaTemplate {
      def packageName = "com.dslplatform.ocd.javas.turtles." + oj.typeSingleName
      def testName = _testName

      val clazz = oj.javaClass
      def tests = Nil

      override def classDecorations = Seq("""SuppressWarnings({ "serial", "rawtypes", "unchecked" })""")

      override def leadingBlocks = s"""
      final ${oj.javaClass} defaultValue = ${oj.defaultValue};
""" +: (oj.nonDefaultValues.zipWithIndex.map { case (ndv, index) => s"""
      final ${oj.javaClass} nonDefaultValue${index} = ${ndv};
"""
      })
    }
  }
}
