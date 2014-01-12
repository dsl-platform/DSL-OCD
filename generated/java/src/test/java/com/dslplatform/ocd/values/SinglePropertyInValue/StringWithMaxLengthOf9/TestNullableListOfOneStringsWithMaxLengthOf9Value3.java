package com.dslplatform.ocd.values.SinglePropertyInValue.StringWithMaxLengthOf9;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableListOfOneStringsWithMaxLengthOf9Value3;
import org.scalatest._;

public class TestNullableListOfOneStringsWithMaxLengthOf9Value3 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableListOfOneStringsWithMaxLengthOf9Value3.class.getDeclaredField(
                        "nullableListOfOneStringsWithMaxLengthOf9").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                NullableListOfOneStringsWithMaxLengthOf9Value3.class.getDeclaredField(
                        "nullableListOfOneStringsWithMaxLengthOf9").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<String> nullableListOfOneStringsWithMaxLengthOf9 = null;
                }.getClass().getDeclaredField("nullableListOfOneStringsWithMaxLengthOf9").getGenericType(),
                NullableListOfOneStringsWithMaxLengthOf9Value3.class.getDeclaredField("nullableListOfOneStringsWithMaxLengthOf9").getGenericType());
    }
}
