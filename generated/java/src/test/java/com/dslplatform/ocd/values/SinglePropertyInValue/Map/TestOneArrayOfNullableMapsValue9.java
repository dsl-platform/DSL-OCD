package com.dslplatform.ocd.values.SinglePropertyInValue.Map;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfNullableMapsValue9;
import org.scalatest._;

public class TestOneArrayOfNullableMapsValue9 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfNullableMapsValue9.class.getDeclaredField(
                        "oneArrayOfNullableMaps").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Map[].class,
                OneArrayOfNullableMapsValue9.class.getDeclaredField(
                        "oneArrayOfNullableMaps").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Map<String, String>[] oneArrayOfNullableMaps = null;
                }.getClass().getDeclaredField("oneArrayOfNullableMaps").getGenericType(),
                OneArrayOfNullableMapsValue9.class.getDeclaredField("oneArrayOfNullableMaps").getGenericType());
    }
}
