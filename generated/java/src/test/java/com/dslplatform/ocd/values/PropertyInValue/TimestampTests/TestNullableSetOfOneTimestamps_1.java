package com.dslplatform.ocd.values.PropertyInValue.TimestampTests;

import com.dslplatform.ocd.values.PropertyInValue.NullableSetOfOneTimestamps_1;

public class TestNullableSetOfOneTimestamps_1 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableSetOfOneTimestamps_1.class.getDeclaredField(
                        "nullableSetOfOneTimestamps").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                NullableSetOfOneTimestamps_1.class.getDeclaredField(
                        "nullableSetOfOneTimestamps").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<org.joda.time.DateTime> nullableSetOfOneTimestamps = null;
                }.getClass().getDeclaredField("nullableSetOfOneTimestamps").getGenericType(),
                NullableSetOfOneTimestamps_1.class.getDeclaredField("nullableSetOfOneTimestamps").getGenericType());
    }
}
