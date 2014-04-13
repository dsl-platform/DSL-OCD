package com.dslplatform.ocd
package test
package javatest
package property

import javas._

trait TestJavaPropertySetterType
    extends TestComponent {

  def conceptName: String
  def property: OcdJavaProperty
  def visibility: Visibility
  def modifiers: Set[Modifier]

  private def propertyName = property.propertyName
  private def PropertyName = property.propertyName.fciu
  private def setterName = "set" + PropertyName

  def testComponentBody = (property.propertyBoxKind match {
    case propertyType: OcdJavaBoxType =>
      new TestJavaBoxTypePropertySetterType(propertyType)

    case x =>
      ???
  }).testComponentBody

  class TestJavaBoxTypePropertySetterType(
      propertyType: OcdJavaBoxType
    ) extends TestComponent {

    def testComponentBody = (
      visibilityTest
    + modifiersTest
    + classTest
    + propertyType.hasGenerics.ifTrue(genericsTypeTest)
    )

    private def baseClass = s"${propertyType.javaType.baseClass}.class"

    private def visibilityTest = s"""
    /* Testing the "${propertyName}" property setter ${visibility.name} visibility via reflection (no instantiation) */
    @org.junit.Test
    public void test${PropertyName}PropertySetter${visibility}Visibility() throws NoSuchMethodException {
        org.junit.Assert.assertEquals(
                ${visibility.javaModifier},
                ${conceptName}.class.getDeclaredMethod(
                    "${setterName}", ${baseClass}).getModifiers() & 7);
    }
"""

    private def modifiersTest = s"""
    /* Testing the "${propertyName}" property setter modifiers ${if (modifiers.isEmpty) "" else modifiers.map(_.name).mkString("(", ", ", ") ")}via reflection (no instantiation) */
    @org.junit.Test
    public void test${PropertyName}PropertySetterModifiers() throws NoSuchMethodException {
        org.junit.Assert.assertEquals(
                ${modifiers.map(_.javaModifier).mkString(" | ") match { case x if x.nonEmpty => x; case _ => "0"}},
                ${conceptName}.class.getDeclaredMethod(
                    "${setterName}", ${baseClass}).getModifiers() & ~7);
    }
"""

    private def classTest = s"""
    /* Testing the "${propertyName}" property setter class via reflection (no instantiation) */
    @org.junit.Test
    public void test${PropertyName}PropertySetterClass() throws NoSuchMethodException {
        org.junit.Assert.assertEquals(
                ${conceptName}.class,
                ${conceptName}.class.getDeclaredMethod(
                        "${setterName}", ${baseClass}).getReturnType());
    }
"""

    private def genericsTypeTest = s"""
    /* Testing the "${propertyName}" property setter generic type via reflection (no instantiation) */
    @org.junit.Test
    public void test${PropertyName}PropertySetterGenericType() throws NoSuchMethodException, NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    ${visibility.javaFieldPrefix}${
                      modifiers.filterNot(Modifier.Static ==).map(_.javaFieldPrefix).mkString
                    }${propertyType.javaClass} ${propertyName} = ${propertyType.defaultValue};
                }.getClass().getDeclaredField("${propertyName}").getGenericType(),
                ${conceptName}.class.getDeclaredMethod("${setterName}", ${baseClass})
                        .getGenericParameterTypes()[0]);
    }
"""
  }
}
