package com.dslplatform.ocd
package javas
package turtle

import config._
import test._
import javatest._

class OcdJavaDefaultsEqualityTurtle
    extends ITestProject {

  def projectPath = "turtles/defaults-equality"
  def projectName = "OCD Java Defaults Equality Turtle"

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

      def tests = Seq(new TestComponent{
        def testComponentBody = s"""
    /* Performs equality checks on all border values */
    @org.junit.Test
    public void testBorderValueEqualities() {${
      oj.borderValues.zipWithIndex.map { case (bv, index) =>
        setupBorderValue(oj, "borderValue" + (index + 1), bv) ++
        testBorderValue(oj, "borderValue" + (index + 1), bv)
       }.mkString}
    }
"""
      })
    }
  }

  private def setupBorderValue(oj: OcdJava, name: String, value: JavaValue) = s"""
        final ${oj.javaClass} ${name} = ${value};
"""

  private def testBorderValue(oj: OcdJava, name: String, value: JavaValue) = s"""
//        org.junit.Assert.assertEquals(${value}, ${name});
"""
}
