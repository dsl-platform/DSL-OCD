package com.dslplatform.ocd
package test
package java

trait TestGetterTypeJava
    extends TestJavaTemplate
    with types.TestGetterType {

  def javaClass: String
  def fieldName: String
  def fieldClass: String

  def testJavaFieldType = s"""
    @Test
    public void TestGetterType() throw NoSuchFieldException {
        assertTrue(new FieldTester(${javaClass}.class, "${fieldName}").typeEquals(${fieldClass}.class));
    }
"""
}
