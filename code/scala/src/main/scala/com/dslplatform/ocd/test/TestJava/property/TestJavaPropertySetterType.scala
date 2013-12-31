package com.dslplatform.ocd
package test
package TestJava
package property

trait TestJavaPropertySetterType
    extends TestComponentJava
    with types.TestPropertySetterType {

  val testDesc = "Test property setter type"

  val imports = Seq(
    "static org.junit.Assert.*"
  , "java.util.*"
  , "java.lang.reflect.*"
  )

  def javaClass: String
  def fieldName: String
  def fieldClass: String

  private def setterName = "set" + fieldName.head.toUpper + fieldName.tail

  private def isSimpleType = fieldClass contains '<'

  def testComponentBody =
    s"""
    /* Testing the property setter method type via reflection (no instantiation) */
    @Test
    public void testPropertySetterType() throws NoSuchMethodException {
${if (isSimpleType) parameterizedTest else simpleTest}
    }
"""

  private def simpleTest =
    s"""
        assertEquals(
                ${javaClass}.class,
                ${javaClass}.class.getMethod("${setterName}", ${simpleType}).getReturnType());
"""

  private def parameterizedTest =
    s"""
        final Method method = ${javaClass}.class.getMethod("${setterName}", ${trimmedType});

        assertEquals(
                ${typeSwitcher},
                method.getGenericParameterTypes()[0]);

        assertEquals(
                ${javaClass}.class,
                method.getGenericReturnType());
"""

  private def simpleType =
    fieldClass + ".class"

  private def trimmedType =
    simpleType.replaceFirst("<.*>", "")

  private def typeSwitcher =
    if (isSimpleType) parameterizedType else simpleType

  private def parameterizedType =
    s"""new Object() {
                    @SuppressWarnings("unused")
                    public ${javaClass} setEtalon(final ${fieldClass} etalon) { return null; }
                }.getClass().getMethod("setEtalon", ${trimmedType}).getGenericParameterTypes()[0]"""
}
