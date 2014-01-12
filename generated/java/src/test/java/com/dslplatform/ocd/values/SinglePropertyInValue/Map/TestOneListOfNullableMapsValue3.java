package com.dslplatform.ocd.values.SinglePropertyInValue.Map;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneListOfNullableMapsValue3;
import org.scalatest._;

public class TestOneListOfNullableMapsValue3 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneListOfNullableMapsValue3.class.getDeclaredField(
                        "oneListOfNullableMaps").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                OneListOfNullableMapsValue3.class.getDeclaredField(
                        "oneListOfNullableMaps").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<java.util.Map<String, String>> oneListOfNullableMaps = null;
                }.getClass().getDeclaredField("oneListOfNullableMaps").getGenericType(),
                OneListOfNullableMapsValue3.class.getDeclaredField("oneListOfNullableMaps").getGenericType());
    }
}
