package com.dslplatform.ocd.values.SinglePropertyInValue.DoubleTests;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableDoubleValue1;

public class TestNullableDoubleValue1 {

    /* Testing the property field private access via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableDoubleValue1.class.getDeclaredField(
                        "nullableDouble").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                Double.class,
                NullableDoubleValue1.class.getDeclaredField(
                        "nullableDouble").getType());
    }
}
