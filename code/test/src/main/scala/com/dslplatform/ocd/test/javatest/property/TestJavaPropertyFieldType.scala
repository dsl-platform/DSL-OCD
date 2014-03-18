package com.dslplatform.ocd
package test
package javatest
package property

import com.dslplatform.ocd.javas.OcdJava

trait TestJavaPropertyFieldType
    extends test.TestComponent {

  def conceptName: String
  def propertyName: String
  def propertyType: OcdJava
  def visibility: Visibility
  def modifiers: Set[Modifier]

  def testComponentBody = (
    visibilityTest
  + modifiersTest
  + classTest
  + (propertyType.hasGenerics match {
      case true => genericsTypeTest
      case _ => ""
    })
  )

  private def propertyClass =
    if (propertyType.hasGenerics)
      propertyType.javaClass.replaceFirst("<.*>", "")
    else
      propertyType.javaClass

  private def PropertyName = propertyName.fciu

  private def visibilityTest = s"""
    /* Testing the "${PropertyName}" property field ${visibility.name} visibility via reflection (no instantiation) */
    @org.junit.Test
    public void test${PropertyName}PropertyField${visibility}Visibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                ${visibility.javaModifier},
                ${conceptName}.class.getDeclaredField(
                    "${propertyName}").getModifiers() & 7);
    }
"""

  private def modifiersTest = s"""
    /* Testing the "${PropertyName}" property field modifiers ${if (modifiers.isEmpty) "" else modifiers.map(_.name).mkString("(", ", ", ") ")}via reflection (no instantiation) */
    @org.junit.Test
    public void test${PropertyName}PropertyFieldModifiers() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                ${modifiers.map(_.javaModifier).mkString(" | ") match { case x if x.nonEmpty => x; case _ => "0"}},
                ${conceptName}.class.getDeclaredField(
                    "${propertyName}").getModifiers() & ~7);
    }
"""

  private def classTest = s"""
    /* Testing the "${PropertyName}" property field class via reflection (no instantiation) */
    @org.junit.Test
    public void test${PropertyName}PropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                ${propertyClass}.class,
                ${conceptName}.class.getDeclaredField(
                        "${propertyName}").getType());
    }
"""

  private def genericsTypeTest = s"""
    /* Testing the "${PropertyName}" property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void test${PropertyName}PropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    ${visibility.javaFieldPrefix}final ${propertyType.javaClass} ${propertyName} = ${propertyType.defaultValue};
                }.getClass().getDeclaredField("${propertyName}").getGenericType(),
                ${conceptName}.class.getDeclaredField("${propertyName}").getGenericType());
    }
"""
}
