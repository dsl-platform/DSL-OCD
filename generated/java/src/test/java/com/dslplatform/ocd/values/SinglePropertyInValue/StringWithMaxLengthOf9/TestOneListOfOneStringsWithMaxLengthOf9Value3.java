package com.dslplatform.ocd.values.SinglePropertyInValue.StringWithMaxLengthOf9;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneListOfOneStringsWithMaxLengthOf9Value3;
import org.scalatest._;

public class TestOneListOfOneStringsWithMaxLengthOf9Value3 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneListOfOneStringsWithMaxLengthOf9Value3.class.getDeclaredField(
                        "oneListOfOneStringsWithMaxLengthOf9").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                OneListOfOneStringsWithMaxLengthOf9Value3.class.getDeclaredField(
                        "oneListOfOneStringsWithMaxLengthOf9").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<String> oneListOfOneStringsWithMaxLengthOf9 = null;
                }.getClass().getDeclaredField("oneListOfOneStringsWithMaxLengthOf9").getGenericType(),
                OneListOfOneStringsWithMaxLengthOf9Value3.class.getDeclaredField("oneListOfOneStringsWithMaxLengthOf9").getGenericType());
    }
}
