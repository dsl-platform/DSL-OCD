package com.dslplatform.ocd.values.SinglePropertyInValue.Boolean;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfOneBooleansValue5;

public class TestNullableArrayOfOneBooleansValue5 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableArrayOfOneBooleansValue5.class.getDeclaredField(
                        "nullableArrayOfOneBooleans").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                boolean[].class,
                NullableArrayOfOneBooleansValue5.class.getDeclaredField(
                        "nullableArrayOfOneBooleans").getType());
    }
}
