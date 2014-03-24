package com.dslplatform.ocd
package test
package javatest
package property

import com.dslplatform.ocd.javas.OcdJava

trait TestJavaPropertyGetterType
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

  private def getterName = "get" + PropertyName

  private def visibilityTest = s"""
    /* Testing the "${propertyName}" property getter ${visibility.name} visibility via reflection (no instantiation) */
    @org.junit.Test
    public void test${PropertyName}PropertyGetter${visibility}Visibility() throws NoSuchMethodException {
        org.junit.Assert.assertEquals(
                ${visibility.javaModifier},
                ${conceptName}.class.getDeclaredMethod(
                    "${getterName}").getModifiers() & 7);
    }
"""

  private def modifiersTest = s"""
    /* Testing the "${propertyName}" property getter modifiers ${if (modifiers.isEmpty) "" else modifiers.map(_.name).mkString("(", ", ", ") ")}via reflection (no instantiation) */
    @org.junit.Test
    public void test${PropertyName}PropertyGetterModifiers() throws NoSuchMethodException {
        org.junit.Assert.assertEquals(
                ${modifiers.map(_.javaModifier).mkString(" | ") match { case x if x.nonEmpty => x; case _ => "0"}},
                ${conceptName}.class.getDeclaredMethod(
                    "${getterName}").getModifiers() & ~7);
    }
"""

  private def classTest = s"""
    /* Testing the "${propertyName}" property getter class via reflection (no instantiation) */
    @org.junit.Test
    public void test${PropertyName}PropertyGetterClass() throws NoSuchMethodException {
        org.junit.Assert.assertEquals(
                ${propertyClass}.class,
                ${conceptName}.class.getDeclaredMethod(
                        "${getterName}").getReturnType());
    }
"""

  private def genericsTypeTest = s"""
    /* Testing the "${propertyName}" property getter generic type via reflection (no instantiation) */
    @org.junit.Test
    public void test${PropertyName}PropertyGetterGenericType() throws NoSuchMethodException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    ${visibility.javaFieldPrefix}${
                      modifiers.filterNot(Modifier.Static ==).map(_.javaFieldPrefix).mkString
                    }${propertyType.javaClass} ${getterName}() {
                        return ${propertyType.defaultValue};
                    }
                }.getClass().getDeclaredMethod("${getterName}").getGenericReturnType(),
                ${conceptName}.class.getDeclaredMethod("${getterName}").getGenericReturnType());
    }
"""
}
