package com.dslplatform.ocd.values.PropertyInValue.GuidTests;

import com.dslplatform.ocd.values.PropertyInValue.OneSetOfNullableGuids_1;

public class TestOneSetOfNullableGuids_1 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneSetOfNullableGuids_1.class.getDeclaredField(
                        "oneSetOfNullableGuids").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                OneSetOfNullableGuids_1.class.getDeclaredField(
                        "oneSetOfNullableGuids").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<java.util.UUID> oneSetOfNullableGuids = null;
                }.getClass().getDeclaredField("oneSetOfNullableGuids").getGenericType(),
                OneSetOfNullableGuids_1.class.getDeclaredField("oneSetOfNullableGuids").getGenericType());
    }
}
