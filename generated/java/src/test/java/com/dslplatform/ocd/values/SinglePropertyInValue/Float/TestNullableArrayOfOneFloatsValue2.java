package com.dslplatform.ocd.values.SinglePropertyInValue.Float;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfOneFloatsValue2;
import org.scalatest._;

public class TestNullableArrayOfOneFloatsValue2 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableArrayOfOneFloatsValue2.class.getDeclaredField(
                        "nullableArrayOfOneFloats").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                float[].class,
                NullableArrayOfOneFloatsValue2.class.getDeclaredField(
                        "nullableArrayOfOneFloats").getType());
    }
}
