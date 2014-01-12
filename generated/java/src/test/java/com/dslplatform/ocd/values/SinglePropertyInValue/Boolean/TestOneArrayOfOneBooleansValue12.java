package com.dslplatform.ocd.values.SinglePropertyInValue.Boolean;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfOneBooleansValue12;
import org.scalatest._;

public class TestOneArrayOfOneBooleansValue12 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfOneBooleansValue12.class.getDeclaredField(
                        "oneArrayOfOneBooleans").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                boolean[].class,
                OneArrayOfOneBooleansValue12.class.getDeclaredField(
                        "oneArrayOfOneBooleans").getType());
    }
}
