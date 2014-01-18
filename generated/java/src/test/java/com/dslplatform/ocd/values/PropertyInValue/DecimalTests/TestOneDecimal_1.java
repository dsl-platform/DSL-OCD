package com.dslplatform.ocd.values.PropertyInValue.DecimalTests;

import com.dslplatform.ocd.values.PropertyInValue.OneDecimal_1;

public class TestOneDecimal_1 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneDecimal_1.class.getDeclaredField(
                        "oneDecimal").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.math.BigDecimal.class,
                OneDecimal_1.class.getDeclaredField(
                        "oneDecimal").getType());
    }
}
