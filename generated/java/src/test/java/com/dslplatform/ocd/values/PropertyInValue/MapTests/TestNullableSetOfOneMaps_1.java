package com.dslplatform.ocd.values.PropertyInValue.MapTests;

import com.dslplatform.ocd.values.PropertyInValue.NullableSetOfOneMaps_1;

public class TestNullableSetOfOneMaps_1 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableSetOfOneMaps_1.class.getDeclaredField(
                        "nullableSetOfOneMaps").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                NullableSetOfOneMaps_1.class.getDeclaredField(
                        "nullableSetOfOneMaps").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<java.util.Map<String, String>> nullableSetOfOneMaps = null;
                }.getClass().getDeclaredField("nullableSetOfOneMaps").getGenericType(),
                NullableSetOfOneMaps_1.class.getDeclaredField("nullableSetOfOneMaps").getGenericType());
    }
}
