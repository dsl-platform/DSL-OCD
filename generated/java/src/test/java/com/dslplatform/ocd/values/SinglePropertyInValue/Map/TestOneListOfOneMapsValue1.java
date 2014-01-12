package com.dslplatform.ocd.values.SinglePropertyInValue.Map;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneListOfOneMapsValue1;
import org.scalatest._;

public class TestOneListOfOneMapsValue1 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneListOfOneMapsValue1.class.getDeclaredField(
                        "oneListOfOneMaps").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                OneListOfOneMapsValue1.class.getDeclaredField(
                        "oneListOfOneMaps").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<java.util.Map<String, String>> oneListOfOneMaps = null;
                }.getClass().getDeclaredField("oneListOfOneMaps").getGenericType(),
                OneListOfOneMapsValue1.class.getDeclaredField("oneListOfOneMaps").getGenericType());
    }
}
