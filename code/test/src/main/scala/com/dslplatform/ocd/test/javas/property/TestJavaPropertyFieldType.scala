package com.dslplatform.ocd
package `test.javas`
package property

import javas._

trait TestJavaPropertyFieldType
    extends test.TestComponent {

  def conceptName: String
  def propertyName: String
  def propertyType: OcdJava

  def testComponentBody =
    nonPublicTest +
    classTest +
    (propertyType.hasGenerics match {
      case true => genericsTypeTest
      case _ => ""
   })

  private def propertyClass =
    if (propertyType.hasGenerics)
      propertyType.javaClass.replaceFirst("<.*>", "")
    else
      propertyType.javaClass

  private def nonPublicTest = s"""
    /* Testing the property field private access via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                ${conceptName}.class.getDeclaredField(
                        "${propertyName}").getModifiers());
    }
"""

  private def classTest = s"""
    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                ${propertyClass}.class,
                ${conceptName}.class.getDeclaredField(
                        "${propertyName}").getType());
    }
"""

  private def genericsTypeTest = s"""
    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final ${propertyType.javaClass} ${propertyName} = null;
                }.getClass().getDeclaredField("${propertyName}").getGenericType(),
                $conceptName.class.getDeclaredField("${propertyName}").getGenericType());
    }
"""
}
