package com.dslplatform.ocd.values.SinglePropertyInValue.Integer;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableListOfOneIntegersValue2;
import org.scalatest._;

public class TestNullableListOfOneIntegersValue2 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableListOfOneIntegersValue2.class.getDeclaredField(
                        "nullableListOfOneIntegers").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                NullableListOfOneIntegersValue2.class.getDeclaredField(
                        "nullableListOfOneIntegers").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<Integer> nullableListOfOneIntegers = null;
                }.getClass().getDeclaredField("nullableListOfOneIntegers").getGenericType(),
                NullableListOfOneIntegersValue2.class.getDeclaredField("nullableListOfOneIntegers").getGenericType());
    }
}
