package com.dslplatform.ocd
package test
package javatest
package property

import javas._

trait TestJavaPropertyFieldType
    extends TestComponent {

  def conceptName: String
  def property: OcdJavaProperty
  def visibility: Visibility
  def modifiers: Set[Modifier]

  private def propertyName = property.propertyName
  private def PropertyName = property.propertyName.fciu

  def testComponentBody = (property.propertyBoxKind match {
    case propertyType: OcdJavaBoxType =>
      new TestJavaBoxTypePropertyFieldType(propertyType)

    case x =>
      ???
  }).testComponentBody

  class TestJavaBoxTypePropertyFieldType(
      propertyType: OcdJavaBoxType
    ) extends TestComponent {

    def testComponentBody = (
      visibilityTest
    + modifiersTest
    + classTest
    + propertyType.hasGenerics.ifTrue(genericsTypeTest)
    )

    private def visibilityTest = s"""
    /* Testing the "${propertyName}" property field ${visibility.name} visibility via reflection (no instantiation) */
    @org.junit.Test
    public void test${PropertyName}PropertyField${visibility}Visibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                ${visibility.javaModifier},
                ${conceptName}.class.getDeclaredField(
                    "${propertyName}").getModifiers() & 7);
    }
"""

    private def modifiersTest = s"""
    /* Testing the "${propertyName}" property field modifiers ${modifiers.nonEmpty.ifTrue(modifiers.map(_.name).mkString("(", ", ", ") "))}via reflection (no instantiation) */
    @org.junit.Test
    public void test${PropertyName}PropertyFieldModifiers() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                ${modifiers.map(_.javaModifier).mkString(" | ") match { case x if x.nonEmpty => x; case _ => "0"}},
                ${conceptName}.class.getDeclaredField(
                    "${propertyName}").getModifiers() & ~7);
    }
"""

    private def classTest = s"""
    /* Testing the "${propertyName}" property field class via reflection (no instantiation) */
    @org.junit.Test
    public void test${PropertyName}PropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                ${propertyType.javaType.baseClass}.class,
                ${conceptName}.class.getDeclaredField(
                        "${propertyName}").getType());
    }
"""

    private def genericsTypeTest = s"""
    /* Testing the "${propertyName}" property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void test${PropertyName}PropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    ${visibility.javaFieldPrefix}${
                      modifiers.filterNot(Modifier.Static ==).map(_.javaFieldPrefix).mkString
                    }${propertyType.javaClass} ${propertyName} = ${propertyType.defaultValue};
                }.getClass().getDeclaredField("${propertyName}").getGenericType(),
                ${conceptName}.class.getDeclaredField("${propertyName}").getGenericType());
    }
"""
  }
}
