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
        "com.dslplatform.client.Bootstrap"
      , "com.dslplatform.client.JsonSerialization"
      , "com.dslplatform.patterns.ServiceLocator"
      , "com.dslplatform.patterns.Bytes"
      , "java.io.IOException"
      , "org.slf4j.Logger"
      )

      override def leadingBlocks = Seq(
s"""    private static JsonSerialization jsonSerialization;
    private static Logger logger;

    @org.junit.BeforeClass
    public static void initializeJsonSerialization() throws IOException {
        final ServiceLocator locator = Bootstrap.init(
                ${testName}.class.getResourceAsStream("/dsl-project.ini"));
        jsonSerialization = locator.resolve(JsonSerialization.class);
        logger = locator.resolve(Logger.class);
    }
""")

      def tests = ojbt.borderValues
        .filter(DisallowedNullValue ne)
        .zipWithIndex.map { case (bv, index) =>
          new TestComponent {
            def testComponentBody =
              testValue(ojbt, (index == 0).ifTrue("defaultValue", "borderValue" + index), bv)
          }
        }

      private def deserialization(ojbt: OcdJavaBoxType, input: String, output: String): String = ojbt.javaType match {
        case JavaSimpleType(baseClass) =>
          s"final ${ojbt.javaClass} ${output} = jsonSerialization.deserialize(${baseClass}.class, ${input}.content, ${input}.length);"

        case JavaCollectionType("java.util.List", JavaGenericType(baseClass @ "java.util.Map", _*)) =>
          s"""@SuppressWarnings("unchecked")
        final ${ojbt.javaClass} ${output} =
                (${ojbt.javaType})
                (java.util.List<?>)
                jsonSerialization.deserializeList(${baseClass}.class, ${input}.content, ${input}.length);"""

        case JavaCollectionType("java.util.List", elementType) =>
          s"final ${ojbt.javaClass} ${output} = jsonSerialization.deserializeList(${elementType.baseClass}.class, ${input}.content, ${input}.length);"

        case JavaCollectionType("java.util.Set", elementType @ JavaGenericType(baseClass @ "java.util.Map", _*)) =>
          s"""@SuppressWarnings("unchecked")
        final java.util.List<${elementType}> deserializedTmpList =
                (java.util.List<${elementType}>) (java.util.List<?>)
                jsonSerialization.deserializeList(${elementType.baseClass}.class, ${input}.content, ${input}.length);
        final ${ojbt.javaClass} ${output} = deserializedTmpList == null ? null : new java.util.HashSet<${elementType}>(deserializedTmpList);"""

        case JavaCollectionType("java.util.Set", elementType) =>
          s"""final java.util.List<${elementType}> deserializedTmpList = jsonSerialization.deserializeList(${elementType.baseClass}.class, ${input}.content, ${input}.length);
        final ${ojbt.javaClass} ${output} = deserializedTmpList == null ? null : new java.util.HashSet<${elementType}>(deserializedTmpList);"""

        case JavaCollectionType("java.util.Queue", elementType @ JavaGenericType(baseClass @ "java.util.Map", _*)) =>
          s"""@SuppressWarnings("unchecked")
        final java.util.List<${elementType}> deserializedTmpList =
                (java.util.List<${elementType}>) (java.util.List<?>)
                jsonSerialization.deserializeList(${elementType.baseClass}.class, ${input}.content, ${input}.length);
        final ${ojbt.javaClass} ${output} = deserializedTmpList == null ? null : new java.util.ArrayDeque<${elementType}>(deserializedTmpList);"""

        case JavaCollectionType("java.util.Queue", elementType) =>
          s"""final java.util.List<${elementType}> deserializedTmpList = jsonSerialization.deserializeList(${elementType.baseClass}.class, ${input}.content, ${input}.length);
        final ${ojbt.javaClass} ${output} = deserializedTmpList == null ? null : new java.util.ArrayDeque<${elementType}>(deserializedTmpList);"""

        case JavaGenericType(baseClass @ "java.util.Map", _*) =>
          s"final ${ojbt.javaClass} ${output} = (java.util.Map<String, String>) jsonSerialization.deserialize(${baseClass}.class, ${input}.content, ${input}.length);"

        case _ => ???
      }

      private def testValue(ojbt: OcdJavaBoxType, name: String, value: JavaValue) = s"""
    /* Equality test to check if assertions / JSON serialization works */
    @org.junit.Test
    public void test${name.fciu}Equality() throws IOException {
        final ${ojbt.javaClass} ${name} = ${value};
        logger.trace("About to serialize: " + ${name});

        final Bytes ${name}JsonSerialized = jsonSerialization.serialize($name);
        logger.debug("Serialized: " + ${name}JsonSerialized.toUtf8());

        ${deserialization(ojbt, s"${name}JsonSerialized", s"${name}JsonDeserialized")}
        logger.trace("Deserialized: " + ${name}JsonDeserialized);

        com.dslplatform.ocd.javaasserts.${ojbt.typeSingleName}Asserts.assert${ojbt.boxName}Equals(${name}, ${name}JsonDeserialized);
    }
"""
    }
  }
}
