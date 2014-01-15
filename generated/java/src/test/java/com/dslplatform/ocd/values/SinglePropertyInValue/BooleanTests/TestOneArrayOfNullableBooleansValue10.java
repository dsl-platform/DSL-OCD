package com.dslplatform.ocd.values.SinglePropertyInValue.BooleanTests;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfNullableBooleansValue10;

public class TestOneArrayOfNullableBooleansValue10 {

    /* Testing the property field private access via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfNullableBooleansValue10.class.getDeclaredField(
                        "oneArrayOfNullableBooleans").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                Boolean[].class,
                OneArrayOfNullableBooleansValue10.class.getDeclaredField(
                        "oneArrayOfNullableBooleans").getType());
    }
}
