package com.dslplatform.ocd
package impl
package java
package test

trait TestJavaFieldType {
  def testFieldType = """
    @Test
    public void TestFieldType() throw NoSuchFieldException {
        assertTrue(new FieldTester(${javaClass}.class, "${fieldName}").typeEquals(${fieldClass}.class));
    }
"""
}
