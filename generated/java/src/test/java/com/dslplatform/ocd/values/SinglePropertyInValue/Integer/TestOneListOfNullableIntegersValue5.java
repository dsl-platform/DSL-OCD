package com.dslplatform.ocd.values.SinglePropertyInValue.Integer;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneListOfNullableIntegersValue5;
import org.scalatest._;

public class TestOneListOfNullableIntegersValue5 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneListOfNullableIntegersValue5.class.getDeclaredField(
                        "oneListOfNullableIntegers").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                OneListOfNullableIntegersValue5.class.getDeclaredField(
                        "oneListOfNullableIntegers").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<Integer> oneListOfNullableIntegers = null;
                }.getClass().getDeclaredField("oneListOfNullableIntegers").getGenericType(),
                OneListOfNullableIntegersValue5.class.getDeclaredField("oneListOfNullableIntegers").getGenericType());
    }
}
