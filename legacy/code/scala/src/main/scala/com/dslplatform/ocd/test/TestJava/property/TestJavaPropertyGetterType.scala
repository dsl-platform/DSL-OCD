package com.dslplatform.ocd
package test
package TestJava
package property

trait TestJavaPropertyGetterType
    extends TestComponentJava
    with types.TestPropertyGetterType {

  val testDesc = "Test property getter type"

  val imports = Seq(
    "static org.junit.Assert.*"
  , "java.util.*"
  , "java.lang.reflect.*"
  )

  def javaClass: String
  def fieldName: String
  def fieldClass: String

  private def getterName = "get" + fieldName.head.toUpper + fieldName.tail

  private def isSimpleType = fieldClass contains '<'

  def testComponentBody = s"""
    /* Testing the property getter method type via reflection (no instantiation) */
    @Test
    public void testPropertyGetterType() throws NoSuchMethodException {
        assertEquals(
                ${typeSwitcher},
                ${javaClass}.class.getMethod("${getterName}").getGenericReturnType());
    }
"""

  private def typeSwitcher =
    if (isSimpleType) parameterizedType else simpleType

  private def simpleType =
    fieldClass + ".class"

  private def parameterizedType =
    s"""new Object() {
                    @SuppressWarnings("unused")
                    public ${fieldClass} getEtalon() { return null; }
                }.getClass().getMethod("getEtalon").getGenericReturnType()"""
}
