package com.dslplatform.ocd.values.PropertyInValue.GuidTests;

import com.dslplatform.ocd.values.PropertyInValue.OneArrayOfNullableGuids_1;

public class TestOneArrayOfNullableGuids_1 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfNullableGuids_1.class.getDeclaredField(
                        "oneArrayOfNullableGuids").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.UUID[].class,
                OneArrayOfNullableGuids_1.class.getDeclaredField(
                        "oneArrayOfNullableGuids").getType());
    }
}
