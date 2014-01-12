package com.dslplatform.ocd.values.SinglePropertyInValue.Float;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfNullableFloatsValue1;
import org.scalatest._;

public class TestOneArrayOfNullableFloatsValue1 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfNullableFloatsValue1.class.getDeclaredField(
                        "oneArrayOfNullableFloats").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                Float[].class,
                OneArrayOfNullableFloatsValue1.class.getDeclaredField(
                        "oneArrayOfNullableFloats").getType());
    }
}
