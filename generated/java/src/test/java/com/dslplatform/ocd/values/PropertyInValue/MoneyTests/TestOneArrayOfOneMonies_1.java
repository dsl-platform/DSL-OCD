package com.dslplatform.ocd.values.PropertyInValue.MoneyTests;

import com.dslplatform.ocd.values.PropertyInValue.OneArrayOfOneMonies_1;

public class TestOneArrayOfOneMonies_1 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfOneMonies_1.class.getDeclaredField(
                        "oneArrayOfOneMonies").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.math.BigDecimal[].class,
                OneArrayOfOneMonies_1.class.getDeclaredField(
                        "oneArrayOfOneMonies").getType());
    }
}
