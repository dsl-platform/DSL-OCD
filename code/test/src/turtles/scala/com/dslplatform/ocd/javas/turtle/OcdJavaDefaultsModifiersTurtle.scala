package com.dslplatform.ocd
package javas
package turtle

import config._
import test._
import javatest._

class OcdJavaDefaultsModifiersTurtle
    extends ITestProject {

  def projectPath = "turtles/defaults-modifiers"
  def projectName = "OCD Java Defaults Modifiers Turtle"

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

      override def leadingBlocks = s"""
    public static final ${oj.javaClass} defaultValue = ${oj.defaultValue};
""" +: (oj.nonDefaultValues.zipWithIndex.map { case (ndv, index) => s"""
    public static final ${oj.javaClass} nonDefaultValue${index + 1} = ${ndv};
"""
      })

      def tests = Seq(new TestComponent{
        def testComponentBody = s"""
    /* Accesses all the static values to ensure that initialization was performed successfully */
    @org.junit.Test
    public void testValues() {""" +
        (if (oj.defaultValue.toString == "null") { """
        org.junit.Assert.assertNull(defaultValue);"""
        }
        else { s"""
        org.junit.Assert.assertNotNull(defaultValue);"""
        }) + (oj.nonDefaultValues.zipWithIndex map { case (ndv, index) =>
          if (ndv.toString == "null") { s"""
        org.junit.Assert.assertNull(nonDefaultValue${index + 1});"""
          }
          else { s"""
        org.junit.Assert.assertNotNull(nonDefaultValue${index + 1});"""
          }
        } mkString) + """
    }
"""
      })
    }
  }
}
