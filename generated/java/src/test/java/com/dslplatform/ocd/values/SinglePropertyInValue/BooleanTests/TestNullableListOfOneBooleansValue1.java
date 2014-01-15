package com.dslplatform.ocd.values.SinglePropertyInValue.BooleanTests;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableListOfOneBooleansValue1;

public class TestNullableListOfOneBooleansValue1 {

    /* Testing the property field private access via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableListOfOneBooleansValue1.class.getDeclaredField(
                        "nullableListOfOneBooleans").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                NullableListOfOneBooleansValue1.class.getDeclaredField(
                        "nullableListOfOneBooleans").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<Boolean> nullableListOfOneBooleans = null;
                }.getClass().getDeclaredField("nullableListOfOneBooleans").getGenericType(),
                NullableListOfOneBooleansValue1.class.getDeclaredField("nullableListOfOneBooleans").getGenericType());
    }
}
