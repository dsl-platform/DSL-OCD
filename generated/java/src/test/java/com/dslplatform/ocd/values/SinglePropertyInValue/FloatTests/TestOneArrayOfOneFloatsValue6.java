package com.dslplatform.ocd.values.SinglePropertyInValue.FloatTests;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfOneFloatsValue6;

public class TestOneArrayOfOneFloatsValue6 {

    /* Testing the property field private access via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfOneFloatsValue6.class.getDeclaredField(
                        "oneArrayOfOneFloats").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                float[].class,
                OneArrayOfOneFloatsValue6.class.getDeclaredField(
                        "oneArrayOfOneFloats").getType());
    }
}
