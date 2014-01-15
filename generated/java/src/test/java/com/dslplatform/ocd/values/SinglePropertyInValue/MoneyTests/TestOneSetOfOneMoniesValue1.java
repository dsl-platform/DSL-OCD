package com.dslplatform.ocd.values.SinglePropertyInValue.MoneyTests;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneSetOfOneMoniesValue1;

public class TestOneSetOfOneMoniesValue1 {

    /* Testing the property field private access via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneSetOfOneMoniesValue1.class.getDeclaredField(
                        "oneSetOfOneMonies").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                OneSetOfOneMoniesValue1.class.getDeclaredField(
                        "oneSetOfOneMonies").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<java.math.BigDecimal> oneSetOfOneMonies = null;
                }.getClass().getDeclaredField("oneSetOfOneMonies").getGenericType(),
                OneSetOfOneMoniesValue1.class.getDeclaredField("oneSetOfOneMonies").getGenericType());
    }
}
