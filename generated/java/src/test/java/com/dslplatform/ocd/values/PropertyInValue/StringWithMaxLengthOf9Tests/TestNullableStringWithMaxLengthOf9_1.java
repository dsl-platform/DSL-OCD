package com.dslplatform.ocd.values.PropertyInValue.StringWithMaxLengthOf9Tests;

import com.dslplatform.ocd.values.PropertyInValue.NullableStringWithMaxLengthOf9_1;

public class TestNullableStringWithMaxLengthOf9_1 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableStringWithMaxLengthOf9_1.class.getDeclaredField(
                        "nullableStringWithMaxLengthOf9").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                String.class,
                NullableStringWithMaxLengthOf9_1.class.getDeclaredField(
                        "nullableStringWithMaxLengthOf9").getType());
    }
}
