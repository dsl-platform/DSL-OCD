package com.dslplatform.ocd
package test
package TestJava
package values

trait TestJavaFieldType
    extends TestComponentJava
    with types.TestFieldType {

  val testDesc = "Tests field type"

  val imports = Seq(
    "static org.junit.Assert.*"
  , "java.util.*"
  )

  def javaClass: String
  def fieldName: String
  def fieldClass: String

  def isSimpleType = fieldClass contains '<'

    def testComponentBody = s"""
    @Test
    public void testFieldType() throws NoSuchFieldException {
        assertEquals(
                ${typeSwitcher},
                ${javaClass}.class.getDeclaredField("${fieldName}").getGenericType());
    }
"""

  def typeSwitcher =
    if (isSimpleType) parameterizedType else simpleType

  def simpleType =
    fieldClass + ".class"

  def parameterizedType =
    s"""new Object() {
                    @SuppressWarnings("unused")
                    private final ${fieldClass} etalon = null;
                }.getClass().getDeclaredField("etalon").getGenericType()"""
}
