package com.dslplatform.ocd
package test
package TestJava
package values

trait TestJavaSetterType
    extends TestComponentJava
    with types.TestSetterType {

  val testDesc = "Tests getter type"

  val imports = Seq(
    "static org.junit.Assert.*"
  , "java.util.*"
  , "java.lang.reflect.*"
  )

  def javaClass: String
  def fieldName: String
  def fieldClass: String

  private def setterName = "set" + fieldName.head.toUpper + fieldName.tail

  def isSimpleType = fieldClass contains '<'

  def testComponentBody =
    if (isSimpleType) parameterizedTest else simpleTest

  def simpleTest =
    s"""
    @Test
    public void testSetterType() throws NoSuchMethodException {
        assertEquals(
                ${javaClass}.class,
                ${javaClass}.class.getMethod("${setterName}", ${simpleType}).getReturnType());
    }
"""

  def parameterizedTest =
    s"""
    @Test
    public void testSetterType() throws NoSuchMethodException {
        final Method method = ${javaClass}.class.getMethod("${setterName}", ${trimmedType});

        assertEquals(
                ${typeSwitcher},
                method.getGenericParameterTypes()[0]);

        assertEquals(
                ${javaClass}.class,
                method.getGenericReturnType());
    }
"""

  def simpleType =
    fieldClass + ".class"

  def trimmedType =
    simpleType.replaceFirst("<.*>", "")

  def typeSwitcher =
    if (isSimpleType) parameterizedType else simpleType

  def parameterizedType =
    s"""new Object() {
                    @SuppressWarnings("unused")
                    public ${javaClass} setEtalon(final ${fieldClass} etalon) { return null; }
                }.getClass().getMethod("setEtalon", ${trimmedType}).getGenericParameterTypes()[0]"""
}
