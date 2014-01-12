package com.dslplatform.ocd.values.SinglePropertyInValue.Float;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfOneFloatsValue5;
import org.scalatest._;

public class TestOneArrayOfOneFloatsValue5 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfOneFloatsValue5.class.getDeclaredField(
                        "oneArrayOfOneFloats").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                float[].class,
                OneArrayOfOneFloatsValue5.class.getDeclaredField(
                        "oneArrayOfOneFloats").getType());
    }
}
