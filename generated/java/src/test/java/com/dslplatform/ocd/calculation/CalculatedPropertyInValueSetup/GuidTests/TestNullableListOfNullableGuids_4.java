package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.GuidTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.NullableListOfNullableGuids_4;

public class TestNullableListOfNullableGuids_4 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableListOfNullableGuids_4.class.getDeclaredField(
                        "nullableListOfNullableGuids").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                NullableListOfNullableGuids_4.class.getDeclaredField(
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
                NullableListOfNullableGuids_4.class.getDeclaredField("nullableListOfNullableGuids").getGenericType());
    }
}
