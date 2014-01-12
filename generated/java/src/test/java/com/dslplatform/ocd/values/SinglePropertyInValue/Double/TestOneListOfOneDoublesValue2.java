package com.dslplatform.ocd.values.SinglePropertyInValue.Double;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneListOfOneDoublesValue2;
import org.scalatest._;

public class TestOneListOfOneDoublesValue2 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneListOfOneDoublesValue2.class.getDeclaredField(
                        "oneListOfOneDoubles").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                OneListOfOneDoublesValue2.class.getDeclaredField(
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
                OneListOfOneDoublesValue2.class.getDeclaredField("oneListOfOneDoubles").getGenericType());
    }
}
