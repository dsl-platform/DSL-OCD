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
      , "com.dslplatform.patterns.Bytes"
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

//      private val clazz = ojbt.javaClass

      def tests = ojbt.borderValues
        .filter(DisallowedNullValue ne)
        .zipWithIndex.map { case (bv, index) =>
          new TestComponent {
            def testComponentBody =
              testValue(ojbt, (index == 0).ifTrue("defaultValue", "borderValue" + index), bv)
          }
        }

      private def deserialization(javaType: JavaType, bytes: String): String = javaType match {
        case JavaClass(baseClass) =>
          s"""jsonSerialization.deserialize(xxx${baseClass}, ${bytes}.content, ${bytes}.length)"""

        case JavaSimpleType(baseClass) =>
          s"""jsonSerialization.deserialize(${baseClass}.class, ${bytes}.content, ${bytes}.length)"""

        case JavaCollectionType("java.util.List", elementType) =>
          s"""jsonSerialization.deserializeList(${elementType}.class, ${bytes}.content, ${bytes}.length)"""

        case JavaCollectionType("java.util.Set", elementType) =>
          s"""new java.util.HashSet<${elementType}>(${deserialization(JavaCollectionType("java.util.List", elementType), bytes)})"""

        case JavaGenericType(baseClass, elementTypes @ _*) =>
          s"""jsonSerialization.deserialize(${baseClass}, ${bytes}.content, ${bytes}.length)"""
      }

      private def testValue(ojbt: OcdJavaBoxType, name: String, value: JavaValue) = s"""
    /* Equality test to check if assertions / JSON serialization works */
    @org.junit.Test
    public void test${name.fciu}Equality() throws IOException {
        final ${ojbt.javaClass} ${name} = ${value};
        final Bytes ${name}JsonSerialized = jsonSerialization.serialize($name);
        final ${ojbt.javaClass} ${name}JsonDeserialized = ${deserialization(ojbt.javaType, s"${name}JsonSerialized")};
        com.dslplatform.ocd.javaasserts.${ojbt.typeSingleName}Asserts.assert${ojbt.boxName}Equals(${name}, ${name}JsonDeserialized);
    }
"""
    }
  }
}
