package com.dslplatform.ocd.values.SinglePropertyInValue.MapTests;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneSetOfOneMapsValue2;

public class TestOneSetOfOneMapsValue2 {

    /* Testing the property field private access via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneSetOfOneMapsValue2.class.getDeclaredField(
                        "oneSetOfOneMaps").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                OneSetOfOneMapsValue2.class.getDeclaredField(
                        "oneSetOfOneMaps").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<java.util.Map<String, String>> oneSetOfOneMaps = null;
                }.getClass().getDeclaredField("oneSetOfOneMaps").getGenericType(),
                OneSetOfOneMapsValue2.class.getDeclaredField("oneSetOfOneMaps").getGenericType());
    }
}
