package com.dslplatform.ocd.values.SinglePropertyInValue.Float;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfOneFloatsValue2;
import org.scalatest._;

public class TestNullableSetOfOneFloatsValue2 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableSetOfOneFloatsValue2.class.getDeclaredField(
                        "nullableSetOfOneFloats").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                NullableSetOfOneFloatsValue2.class.getDeclaredField(
                        "nullableSetOfOneFloats").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<Float> nullableSetOfOneFloats = null;
                }.getClass().getDeclaredField("nullableSetOfOneFloats").getGenericType(),
                NullableSetOfOneFloatsValue2.class.getDeclaredField("nullableSetOfOneFloats").getGenericType());
    }
}
