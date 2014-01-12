package com.dslplatform.ocd.values.SinglePropertyInValue.Double;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneSetOfOneDoublesValue2;
import org.scalatest._;

public class TestOneSetOfOneDoublesValue2 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneSetOfOneDoublesValue2.class.getDeclaredField(
                        "oneSetOfOneDoubles").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                OneSetOfOneDoublesValue2.class.getDeclaredField(
                        "oneSetOfOneDoubles").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<Double> oneSetOfOneDoubles = null;
                }.getClass().getDeclaredField("oneSetOfOneDoubles").getGenericType(),
                OneSetOfOneDoublesValue2.class.getDeclaredField("oneSetOfOneDoubles").getGenericType());
    }
}
