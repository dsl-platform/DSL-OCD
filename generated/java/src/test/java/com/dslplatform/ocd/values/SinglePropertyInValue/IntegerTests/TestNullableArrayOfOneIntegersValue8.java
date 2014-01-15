package com.dslplatform.ocd.values.SinglePropertyInValue.IntegerTests;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfOneIntegersValue8;

public class TestNullableArrayOfOneIntegersValue8 {

    /* Testing the property field private access via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableArrayOfOneIntegersValue8.class.getDeclaredField(
                        "nullableArrayOfOneIntegers").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                int[].class,
                NullableArrayOfOneIntegersValue8.class.getDeclaredField(
                        "nullableArrayOfOneIntegers").getType());
    }
}
