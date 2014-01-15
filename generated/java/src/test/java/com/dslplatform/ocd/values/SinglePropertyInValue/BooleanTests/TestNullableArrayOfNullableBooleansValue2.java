package com.dslplatform.ocd.values.SinglePropertyInValue.BooleanTests;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfNullableBooleansValue2;

public class TestNullableArrayOfNullableBooleansValue2 {

    /* Testing the property field private access via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableArrayOfNullableBooleansValue2.class.getDeclaredField(
                        "nullableArrayOfNullableBooleans").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                Boolean[].class,
                NullableArrayOfNullableBooleansValue2.class.getDeclaredField(
                        "nullableArrayOfNullableBooleans").getType());
    }
}
