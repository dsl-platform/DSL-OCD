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

      override def imports = Seq(
        "com.dslplatform.client.JsonSerializationTweaks"
      , "com.dslplatform.client.Bootstrap"
      , "com.dslplatform.patterns.ServiceLocator"
      , "com.fasterxml.jackson.databind.JavaType"
      , "java.io.IOException"
      )

      override def leadingBlocks = Seq("""
    private static JsonSerializationTweaks jsonSerialization;

    @org.junit.BeforeClass
    public static void initializeJsonSerialization() throws IOException {
/*
          final ServiceLocator locator = Bootstrap.init(new java.io.ByteArrayInputStream(
                "username=x\nproject-id=x\napi-url=x\npackage-name=x".getBytes("UTF-8")));
        jsonSerialization = locator.resolve(JsonSerialization.class);
*/
        jsonSerialization = new JsonSerializationTweaks(null);
    }
""")

      val clazz = oj.javaClass

      def tests = Seq(new TestComponent{
        def testComponentBody = s"""
    /* Performs equality checks on all border values */
    @org.junit.Test
    public void testBorderValueEqualities() throws IOException {${
      oj.borderValues.zipWithIndex.map { case (bv, index) =>
        testBorderValue(oj, "borderValue" + (index + 1), bv)
       }.mkString}
    }
"""
      })
    }
  }

  import types._
  import boxes._
  import javas._

  private def testBorderValue(oj: OcdJava, name: String, value: JavaValue) = s"""
        final ${oj.javaClass} ${name} = ${value};
        final String ${name}JsonSerialized = jsonSerialization.serialize($name);
        final JavaType ${name}JavaType = ${oj match {
          case _ if oj.hasGenerics =>
            s"""JsonSerializationTweaks.buildCollectionType(
                  ${oj.javaClass.replaceFirst("<.*>", "")}.class,
                  ${OcdJava.resolve(oj, `box.Nullable`).javaClass}.class);"""

          case _ if oj.hasGenerics =>
            s"""JsonSerializationTweaks.buildCollectionType(${oj.javaClass.replaceFirst("<.*>", "")}.class, ${OcdJava.resolve(oj, `box.Nullable`).javaClass}.class);"""

          case _ =>
            s"""JsonSerializationTweaks.buildType(${oj.javaClass}.class);"""
        }}
        final ${oj.javaClass} ${name}JsonDeserialized = jsonSerialization.deserialize(${name}JavaType, ${name}JsonSerialized);
        com.dslplatform.ocd.javaasserts.${oj.typeSingleName}Asserts.assert${oj.boxName}Equals(${name}, ${name}JsonDeserialized);
"""
}
