package com.dslplatform.ocd.values.SinglePropertyInValue.Float;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfOneFloatsValue4;
import org.scalatest._;

public class TestNullableArrayOfOneFloatsValue4 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableArrayOfOneFloatsValue4.class.getDeclaredField(
                        "nullableArrayOfOneFloats").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                float[].class,
                NullableArrayOfOneFloatsValue4.class.getDeclaredField(
                        "nullableArrayOfOneFloats").getType());
    }
}
