package com.dslplatform.ocd.values.SinglePropertyInValue.Decimal;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneDecimalValue1;
import org.scalatest._;

public class TestOneDecimalValue1 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneDecimalValue1.class.getDeclaredField(
                        "oneDecimal").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.math.BigDecimal.class,
                OneDecimalValue1.class.getDeclaredField(
                        "oneDecimal").getType());
    }
}
