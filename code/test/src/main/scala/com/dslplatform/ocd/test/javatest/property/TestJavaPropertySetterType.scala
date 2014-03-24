package com.dslplatform.ocd
package test
package javatest
package property

import com.dslplatform.ocd.javas.OcdJava

trait TestJavaPropertySetterType
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

  private def setterName = "set" + PropertyName

  private def visibilityTest = s"""
    /* Testing the "${propertyName}" property setter ${visibility.name} visibility via reflection (no instantiation) */
    @org.junit.Test
    public void test${PropertyName}PropertySetter${visibility}Visibility() throws NoSuchMethodException {
        org.junit.Assert.assertEquals(
                ${visibility.javaModifier},
                ${conceptName}.class.getDeclaredMethod(
                    "${setterName}", ${propertyClass}.class).getModifiers() & 7);
    }
"""

  private def modifiersTest = s"""
    /* Testing the "${propertyName}" property setter modifiers ${if (modifiers.isEmpty) "" else modifiers.map(_.name).mkString("(", ", ", ") ")}via reflection (no instantiation) */
    @org.junit.Test
    public void test${PropertyName}PropertySetterModifiers() throws NoSuchMethodException {
        org.junit.Assert.assertEquals(
                ${modifiers.map(_.javaModifier).mkString(" | ") match { case x if x.nonEmpty => x; case _ => "0"}},
                ${conceptName}.class.getDeclaredMethod(
                    "${setterName}", ${propertyClass}.class).getModifiers() & ~7);
    }
"""

  private def classTest = s"""
    /* Testing the "${propertyName}" property setter class via reflection (no instantiation) */
    @org.junit.Test
    public void test${PropertyName}PropertySetterClass() throws NoSuchMethodException {
        org.junit.Assert.assertEquals(
                ${conceptName}.class,
                ${conceptName}.class.getDeclaredMethod(
                        "${setterName}", ${propertyClass}.class).getReturnType());
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
                ${conceptName}.class.getDeclaredMethod("${setterName}", ${propertyClass}.class)
                        .getGenericParameterTypes()[0]);
    }
"""
}
