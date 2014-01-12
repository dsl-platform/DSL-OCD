package com.dslplatform.ocd.values.SinglePropertyInValue.Float;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableListOfNullableFloatsValue1;
import org.scalatest._;

public class TestNullableListOfNullableFloatsValue1 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableListOfNullableFloatsValue1.class.getDeclaredField(
                        "nullableListOfNullableFloats").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                NullableListOfNullableFloatsValue1.class.getDeclaredField(
                        "nullableListOfNullableFloats").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<Float> nullableListOfNullableFloats = null;
                }.getClass().getDeclaredField("nullableListOfNullableFloats").getGenericType(),
                NullableListOfNullableFloatsValue1.class.getDeclaredField("nullableListOfNullableFloats").getGenericType());
    }
}
