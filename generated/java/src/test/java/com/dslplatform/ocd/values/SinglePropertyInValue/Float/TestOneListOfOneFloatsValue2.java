package com.dslplatform.ocd.values.SinglePropertyInValue.Float;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneListOfOneFloatsValue2;
import org.scalatest._;

public class TestOneListOfOneFloatsValue2 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneListOfOneFloatsValue2.class.getDeclaredField(
                        "oneListOfOneFloats").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                OneListOfOneFloatsValue2.class.getDeclaredField(
                        "oneListOfOneFloats").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<Float> oneListOfOneFloats = null;
                }.getClass().getDeclaredField("oneListOfOneFloats").getGenericType(),
                OneListOfOneFloatsValue2.class.getDeclaredField("oneListOfOneFloats").getGenericType());
    }
}
