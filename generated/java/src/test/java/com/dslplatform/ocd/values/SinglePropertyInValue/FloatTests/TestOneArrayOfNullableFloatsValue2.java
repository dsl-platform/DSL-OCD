package com.dslplatform.ocd.values.SinglePropertyInValue.FloatTests;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfNullableFloatsValue2;

public class TestOneArrayOfNullableFloatsValue2 {

    /* Testing the property field private access via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfNullableFloatsValue2.class.getDeclaredField(
                        "oneArrayOfNullableFloats").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                Float[].class,
                OneArrayOfNullableFloatsValue2.class.getDeclaredField(
                        "oneArrayOfNullableFloats").getType());
    }
}
