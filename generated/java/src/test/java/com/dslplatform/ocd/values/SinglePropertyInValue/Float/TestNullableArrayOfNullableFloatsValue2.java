package com.dslplatform.ocd.values.SinglePropertyInValue.Float;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfNullableFloatsValue2;
import org.scalatest._;

public class TestNullableArrayOfNullableFloatsValue2 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableArrayOfNullableFloatsValue2.class.getDeclaredField(
                        "nullableArrayOfNullableFloats").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                Float[].class,
                NullableArrayOfNullableFloatsValue2.class.getDeclaredField(
                        "nullableArrayOfNullableFloats").getType());
    }
}
