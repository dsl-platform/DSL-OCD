package com.dslplatform.ocd.values.SinglePropertyInValue.Float;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableFloatValue2;
import org.scalatest._;

public class TestNullableFloatValue2 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableFloatValue2.class.getDeclaredField(
                        "nullableFloat").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                Float.class,
                NullableFloatValue2.class.getDeclaredField(
                        "nullableFloat").getType());
    }
}
