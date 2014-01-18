package com.dslplatform.ocd.values.PropertyInValue.LongTests;

import com.dslplatform.ocd.values.PropertyInValue.NullableListOfNullableLongs_1;

public class TestNullableListOfNullableLongs_1 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableListOfNullableLongs_1.class.getDeclaredField(
                        "nullableListOfNullableLongs").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                NullableListOfNullableLongs_1.class.getDeclaredField(
                        "nullableListOfNullableLongs").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<Long> nullableListOfNullableLongs = null;
                }.getClass().getDeclaredField("nullableListOfNullableLongs").getGenericType(),
                NullableListOfNullableLongs_1.class.getDeclaredField("nullableListOfNullableLongs").getGenericType());
    }
}
