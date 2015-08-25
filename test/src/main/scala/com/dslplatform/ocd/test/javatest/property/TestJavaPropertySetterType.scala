package com.dslplatform.ocd
package test
package javatest
package property

import javas._

trait TestJavaPropertySetterType
    extends TestComponentWithProperty {

  def visibility: Visibility
  def modifiers = Set.empty[Modifier]
  def testNonExistence = false

  private def setterName = "set" + PropertyName

  def testComponentBody = testNonExistence.ifTrue(nonExistenceTest,
    visibilityTest
  + modifiersTest
  + classTest
  + propertyType.hasGenerics.ifTrue(genericsTypeTest)
  )

  private def baseClass = s"${propertyType.javaType.baseClass}.class"

  private def nonExistenceTest = s"""
    /* Testing the non-existence of the "${propertyName}" property setter (no instantiation) */
    @org.junit.Test(expected=java.lang.NoSuchMethodException.class)
    public void testNonExistenceOf${PropertyName}PropertySetter${testSuffix}() throws NoSuchMethodException {
        org.junit.Assert.assertEquals(
                ${visibility.javaModifier},
                ${conceptName}.class.getDeclaredMethod(
                    "${setterName}", ${baseClass}));
    }
"""

  private def visibilityTest = s"""
    /* Testing the "${propertyName}" property setter ${visibility.name} visibility via reflection (no instantiation) */
    @org.junit.Test
    public void test${PropertyName}PropertySetter${visibility}Visibility${testSuffix}() throws NoSuchMethodException {
        org.junit.Assert.assertEquals(
                ${visibility.javaModifier},
                ${conceptName}.class.getDeclaredMethod(
                    "${setterName}", ${baseClass}).getModifiers() & 7);
    }
"""

  private def modifiersTest = s"""
    /* Testing the "${propertyName}" property setter modifiers ${if (modifiers.isEmpty) "" else modifiers.map(_.name).mkString("(", ", ", ") ")}via reflection (no instantiation) */
    @org.junit.Test
    public void test${PropertyName}PropertySetterModifiers${testSuffix}() throws NoSuchMethodException {
        org.junit.Assert.assertEquals(
                ${modifiers.map(_.javaModifier).mkString(" | ") match { case x if x.nonEmpty => x; case _ => "0"}},
                ${conceptName}.class.getDeclaredMethod(
                    "${setterName}", ${baseClass}).getModifiers() & ~7);
    }
"""

  private def classTest = s"""
    /* Testing the "${propertyName}" property setter class via reflection (no instantiation) */
    @org.junit.Test
    public void test${PropertyName}PropertySetterClass${testSuffix}() throws NoSuchMethodException {
        org.junit.Assert.assertEquals(
                ${conceptName}.class,
                ${conceptName}.class.getDeclaredMethod(
                        "${setterName}", ${baseClass}).getReturnType());
    }
"""

  private def genericsTypeTest = s"""
    /* Testing the "${propertyName}" property setter generic type via reflection (no instantiation) */
    @org.junit.Test
    public void test${PropertyName}PropertySetterGenericType${testSuffix}() throws NoSuchMethodException, NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    ${visibility.javaFieldPrefix}${
                      modifiers.filterNot(Modifier.Static ==).map(_.javaFieldPrefix).mkString
                    }${propertyType.javaClass} ${propertyName} = ${propertyType.defaultValue};
                }.getClass().getDeclaredField("${propertyName}").getGenericType(),
                ${conceptName}.class.getDeclaredMethod("${setterName}", ${baseClass})
                        .getGenericParameterTypes()[0]);
    }
"""
}
