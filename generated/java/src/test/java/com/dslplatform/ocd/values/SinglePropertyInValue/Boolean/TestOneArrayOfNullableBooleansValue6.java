package com.dslplatform.ocd.values.SinglePropertyInValue.Boolean;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfNullableBooleansValue6;
import org.scalatest._;

public class TestOneArrayOfNullableBooleansValue6 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfNullableBooleansValue6.class.getDeclaredField(
                        "oneArrayOfNullableBooleans").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                Boolean[].class,
                OneArrayOfNullableBooleansValue6.class.getDeclaredField(
                        "oneArrayOfNullableBooleans").getType());
    }
}
