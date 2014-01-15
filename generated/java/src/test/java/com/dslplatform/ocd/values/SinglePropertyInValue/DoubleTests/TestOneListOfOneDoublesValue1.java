package com.dslplatform.ocd.values.SinglePropertyInValue.DoubleTests;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneListOfOneDoublesValue1;

public class TestOneListOfOneDoublesValue1 {

    /* Testing the property field private access via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneListOfOneDoublesValue1.class.getDeclaredField(
                        "oneListOfOneDoubles").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                OneListOfOneDoublesValue1.class.getDeclaredField(
                        "oneListOfOneDoubles").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<Double> oneListOfOneDoubles = null;
                }.getClass().getDeclaredField("oneListOfOneDoubles").getGenericType(),
                OneListOfOneDoublesValue1.class.getDeclaredField("oneListOfOneDoubles").getGenericType());
    }
}
