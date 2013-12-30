package com.dslplatform.ocd
package test
package TestJava
package values

trait TestJavaGetterType
    extends TestComponentJava
    with types.TestGetterType {

  val testDesc = "Tests getter type"

  val imports = Seq(
    "static org.junit.Assert.*"
  , "java.util.*"
  )

  def javaClass: String
  def fieldName: String
  def fieldClass: String

  private def getterName = "get" + fieldName.head.toUpper + fieldName.tail

  def isSimpleType = fieldClass contains '<'

  def testComponentBody = s"""
    @Test
    public void testGetterType() throws NoSuchMethodException {
        assertEquals(
                ${typeSwitcher},
                ${javaClass}.class.getMethod("${getterName}").getGenericReturnType());
    }
"""

  def typeSwitcher =
    if (isSimpleType) parameterizedType else simpleType

  def simpleType =
    fieldClass + ".class"

  def parameterizedType =
    s"""new Object() {
                    @SuppressWarnings("unused")
                    public ${fieldClass} getEtalon() { return null; }
                }.getClass().getMethod("getEtalon").getGenericReturnType()"""
}
