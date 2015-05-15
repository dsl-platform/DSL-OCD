package com.dslplatform.ocd
package test
package javatest
package property
package turtle

import config._
import javas._

object TestJavaAssertsBorderValuesTurtle
    extends ITestProject {

  def projectPath = "turtles/asserts"
  def ProjectNameCamel = "AssertsBorderValuesTurtle"
  def projectName = "OCD Java Asserts Border Values Turtle"

  def dslFiles = Map.empty
  def testFiles = Map(
    JAVA -> (for (ojbt <- OcdJavaBoxType.values) yield {
      JavaInfo(makeTemplate(ojbt).testBody).toEntry
    }).toMap
  )

  private def makeTemplate(ojbt: OcdJavaBoxType) = {
    val name = ojbt.javaDescription
    val _testName = s"${name}DefaultValueTurtle"

    new TestJavaTemplate {
      def packageName = "com.dslplatform.ocd.test.javatest.property.turtles." + ojbt.typeSingleName
      def testName = _testName

      override def imports = Seq(
        "com.dslplatform.client.JsonSerialization"
      , "com.dslplatform.client.Bootstrap"
      , "com.dslplatform.patterns.ServiceLocator"
      , "com.fasterxml.jackson.databind.JavaType"
      , "java.io.IOException"
      )

      override def leadingBlocks = Seq("""
    private static JsonSerialization jsonSerialization;

    @org.junit.BeforeClass
    public static void initializeJsonSerialization() throws IOException {
        final ServiceLocator locator = Bootstrap.init(new java.io.ByteArrayInputStream(
                "username=unused\nproject-id=unused\napi-url=unused\npackage-name=unused".getBytes("UTF-8")));
        jsonSerialization = locator.resolve(JsonSerialization.class);
    }
""")

      private val clazz = ojbt.javaClass

      def tests = ojbt.borderValues
        .filter(DisallowedNullValue ne)
        .zipWithIndex.map { case (bv, index) =>
          new TestComponent {
            def testComponentBody =
              testValue(ojbt, (index == 0).ifTrue("defaultValue", "borderValue" + index), bv)
          }
        }

      private def buildType(javaType: JavaType): String = javaType match {
        case JavaClass(baseClass) =>
          s"""${baseClass}.class"""

        case JavaSimpleType(baseClass) =>
          s"""JsonSerialization.buildType(${baseClass}.class)"""

        case JavaCollectionType(baseClass, elementType) =>
          s"""JsonSerialization.buildCollectionType(${baseClass}.class, ${buildType(elementType)})"""

        case JavaGenericType(baseClass, elementTypes @ _*) =>
          s"""JsonSerialization.buildGenericType(${baseClass}.class, ${elementTypes.map(buildType).mkString(", ")})"""
      }

      private def testValue(ojbt: OcdJavaBoxType, name: String, value: JavaValue) = s"""
    /* Equality test to check if assertions / JSON serialization works */
    @org.junit.Test
    public void test${name.fciu}Equality() throws IOException {
        final ${ojbt.javaClass} ${name} = ${value};
        final String ${name}JsonSerialized = jsonSerialization.serialize($name).toUtf8();
        final JavaType ${name}JavaType = ${buildType(ojbt.javaType)};
        final ${ojbt.javaClass} ${name}JsonDeserialized = jsonSerialization.deserialize(${name}JavaType, ${name}JsonSerialized);
        com.dslplatform.ocd.javaasserts.${ojbt.typeSingleName}Asserts.assert${ojbt.boxName}Equals(${name}, ${name}JsonDeserialized);
    }
"""
    }
  }
}
