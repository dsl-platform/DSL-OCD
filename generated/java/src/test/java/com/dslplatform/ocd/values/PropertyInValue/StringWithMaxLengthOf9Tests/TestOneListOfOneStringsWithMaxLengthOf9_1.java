package com.dslplatform.ocd.values.PropertyInValue.StringWithMaxLengthOf9Tests;

import com.dslplatform.ocd.values.PropertyInValue.OneListOfOneStringsWithMaxLengthOf9_1;

public class TestOneListOfOneStringsWithMaxLengthOf9_1 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneListOfOneStringsWithMaxLengthOf9_1.class.getDeclaredField(
                        "oneListOfOneStringsWithMaxLengthOf9").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                OneListOfOneStringsWithMaxLengthOf9_1.class.getDeclaredField(
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
                OneListOfOneStringsWithMaxLengthOf9_1.class.getDeclaredField("oneListOfOneStringsWithMaxLengthOf9").getGenericType());
    }
}
