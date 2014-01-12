package com.dslplatform.ocd.values.SinglePropertyInValue.Boolean;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfOneBooleansValue1;

public class TestNullableSetOfOneBooleansValue1 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableSetOfOneBooleansValue1.class.getDeclaredField(
                        "nullableSetOfOneBooleans").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                NullableSetOfOneBooleansValue1.class.getDeclaredField(
                        "nullableSetOfOneBooleans").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<Boolean> nullableSetOfOneBooleans = null;
                }.getClass().getDeclaredField("nullableSetOfOneBooleans").getGenericType(),
                NullableSetOfOneBooleansValue1.class.getDeclaredField("nullableSetOfOneBooleans").getGenericType());
    }
}
