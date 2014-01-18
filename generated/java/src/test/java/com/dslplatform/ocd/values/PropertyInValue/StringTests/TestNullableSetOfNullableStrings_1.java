package com.dslplatform.ocd.values.PropertyInValue.StringTests;

import com.dslplatform.ocd.values.PropertyInValue.NullableSetOfNullableStrings_1;

public class TestNullableSetOfNullableStrings_1 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableSetOfNullableStrings_1.class.getDeclaredField(
                        "nullableSetOfNullableStrings").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                NullableSetOfNullableStrings_1.class.getDeclaredField(
                        "nullableSetOfNullableStrings").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<String> nullableSetOfNullableStrings = null;
                }.getClass().getDeclaredField("nullableSetOfNullableStrings").getGenericType(),
                NullableSetOfNullableStrings_1.class.getDeclaredField("nullableSetOfNullableStrings").getGenericType());
    }
}
