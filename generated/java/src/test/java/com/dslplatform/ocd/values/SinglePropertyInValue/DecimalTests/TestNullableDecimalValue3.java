package com.dslplatform.ocd.values.SinglePropertyInValue.DecimalTests;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableDecimalValue3;

public class TestNullableDecimalValue3 {

    /* Testing the property field private access via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableDecimalValue3.class.getDeclaredField(
                        "nullableDecimal").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.math.BigDecimal.class,
                NullableDecimalValue3.class.getDeclaredField(
                        "nullableDecimal").getType());
    }
}
