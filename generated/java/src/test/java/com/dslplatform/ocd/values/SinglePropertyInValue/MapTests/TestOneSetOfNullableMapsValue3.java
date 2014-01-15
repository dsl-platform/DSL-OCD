package com.dslplatform.ocd.values.SinglePropertyInValue.MapTests;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneSetOfNullableMapsValue3;

public class TestOneSetOfNullableMapsValue3 {

    /* Testing the property field private access via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneSetOfNullableMapsValue3.class.getDeclaredField(
                        "oneSetOfNullableMaps").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                OneSetOfNullableMapsValue3.class.getDeclaredField(
                        "oneSetOfNullableMaps").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<java.util.Map<String, String>> oneSetOfNullableMaps = null;
                }.getClass().getDeclaredField("oneSetOfNullableMaps").getGenericType(),
                OneSetOfNullableMapsValue3.class.getDeclaredField("oneSetOfNullableMaps").getGenericType());
    }
}
