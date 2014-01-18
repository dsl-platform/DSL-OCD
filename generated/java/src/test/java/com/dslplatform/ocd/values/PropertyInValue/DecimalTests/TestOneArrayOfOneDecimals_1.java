package com.dslplatform.ocd.values.PropertyInValue.DecimalTests;

import com.dslplatform.ocd.values.PropertyInValue.OneArrayOfOneDecimals_1;

public class TestOneArrayOfOneDecimals_1 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfOneDecimals_1.class.getDeclaredField(
                        "oneArrayOfOneDecimals").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.math.BigDecimal[].class,
                OneArrayOfOneDecimals_1.class.getDeclaredField(
                        "oneArrayOfOneDecimals").getType());
    }
}
