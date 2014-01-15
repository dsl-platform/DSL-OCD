package com.dslplatform.ocd.values.SinglePropertyInValue.DoubleTests;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfOneDoublesValue1;

public class TestNullableArrayOfOneDoublesValue1 {

    /* Testing the property field private access via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableArrayOfOneDoublesValue1.class.getDeclaredField(
                        "nullableArrayOfOneDoubles").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                double[].class,
                NullableArrayOfOneDoublesValue1.class.getDeclaredField(
                        "nullableArrayOfOneDoubles").getType());
    }
}
