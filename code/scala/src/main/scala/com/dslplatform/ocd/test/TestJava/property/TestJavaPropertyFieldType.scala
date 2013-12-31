package com.dslplatform.ocd
package test
package TestJava
package property

trait TestJavaPropertyFieldType
    extends TestComponentJava
    with types.TestPropertyFieldType {

  val testDesc = "Test property field type"

  val imports = Seq(
    "static org.junit.Assert.*"
  , "java.util.*"
  , "java.lang.reflect.*"
  )

  def javaClass: String
  def fieldName: String
  def fieldClass: String

  private def isSimpleType = fieldClass contains '<'

  def testComponentBody = s"""
    /* Testing the property field type via reflection (no instantiation) */
    @Test
    public void testPropertyFieldType() throws NoSuchFieldException {
        assertEquals(
                ${typeSwitcher},
                ${javaClass}.class.getDeclaredField("${fieldName}").getGenericType());
    }
"""

  private def typeSwitcher =
    if (isSimpleType) parameterizedType else simpleType

  private def simpleType =
    fieldClass + ".class"

  private def parameterizedType =
    s"""new Object() {
                    @SuppressWarnings("unused")
                    private final ${fieldClass} etalon = null;
                }.getClass().getDeclaredField("etalon").getGenericType()"""
}
