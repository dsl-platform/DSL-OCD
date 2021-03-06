package com.dslplatform.ocd
package test
package javatest
package property

import types._
import javas._

trait TestJavaPropertyGetterType
    extends TestComponentWithProperty {

  def visibility: Visibility
  def modifiers = Set.empty[Modifier]

  private def getterName = "get" + PropertyName

  def testComponentBody = (
    visibilityTest
  + modifiersTest
  + classTest
  + propertyType.hasGenerics.ifTrue(genericsTypeTest)
  )

  private def baseClass = s"${propertyType.javaType.baseClass}.class"

  private def visibilityTest = s"""
    /* Testing the "${propertyName}" property getter ${visibility.name} visibility via reflection (no instantiation) */
    @org.junit.Test
    public void test${PropertyName}PropertyGetter${visibility}Visibility${testSuffix}() throws NoSuchMethodException {
        com.dslplatform.ocd.test.FancyAsserts.assertEquals(
                ${visibility.javaModifier},
                ${conceptName}.class.getDeclaredMethod(
                    "${getterName}").getModifiers() & 7);
    }
"""

  private def modifiersTest = s"""
    /* Testing the "${propertyName}" property getter modifiers ${if (modifiers.isEmpty) "" else modifiers.map(_.name).mkString("(", ", ", ") ")}via reflection (no instantiation) */
    @org.junit.Test
    public void test${PropertyName}PropertyGetterModifiers${testSuffix}() throws NoSuchMethodException {
        com.dslplatform.ocd.test.FancyAsserts.assertEquals(
                ${modifiers.map(_.javaModifier).mkString(" | ") match { case x if x.nonEmpty => x; case _ => "0"}},
                ${conceptName}.class.getDeclaredMethod(
                    "${getterName}").getModifiers() & ~7);
    }
"""

  private def classTest = s"""
    /* Testing the "${propertyName}" property getter class via reflection (no instantiation) */
    @org.junit.Test
    public void test${PropertyName}PropertyGetterClass${testSuffix}() throws NoSuchMethodException {
        com.dslplatform.ocd.test.FancyAsserts.assertEquals(
                ${baseClass},
                ${conceptName}.class.getDeclaredMethod(
                        "${getterName}").getReturnType());
    }
"""

  private def genericsTypeTest = s"""
    /* Testing the "${propertyName}" property getter generic type via reflection (no instantiation) */
    @org.junit.Test
    public void test${PropertyName}PropertyGetterGenericType${testSuffix}() throws NoSuchMethodException {
        com.dslplatform.ocd.test.FancyAsserts.assertEquals(
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
