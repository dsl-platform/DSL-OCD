package com.dslplatform.ocd.values.SinglePropertyInValue.Money;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneListOfNullableMoniesValue1;
import org.scalatest._;

public class TestOneListOfNullableMoniesValue1 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneListOfNullableMoniesValue1.class.getDeclaredField(
                        "oneListOfNullableMonies").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                OneListOfNullableMoniesValue1.class.getDeclaredField(
                        "oneListOfNullableMonies").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<java.math.BigDecimal> oneListOfNullableMonies = null;
                }.getClass().getDeclaredField("oneListOfNullableMonies").getGenericType(),
                OneListOfNullableMoniesValue1.class.getDeclaredField("oneListOfNullableMonies").getGenericType());
    }
}
