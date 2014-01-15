package com.dslplatform.ocd.values.SinglePropertyInValue.GuidTests;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableListOfNullableGuidsValue1;

public class TestNullableListOfNullableGuidsValue1 {

    /* Testing the property field private access via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableListOfNullableGuidsValue1.class.getDeclaredField(
                        "nullableListOfNullableGuids").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                NullableListOfNullableGuidsValue1.class.getDeclaredField(
                        "nullableListOfNullableGuids").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<java.util.UUID> nullableListOfNullableGuids = null;
                }.getClass().getDeclaredField("nullableListOfNullableGuids").getGenericType(),
                NullableListOfNullableGuidsValue1.class.getDeclaredField("nullableListOfNullableGuids").getGenericType());
    }
}
