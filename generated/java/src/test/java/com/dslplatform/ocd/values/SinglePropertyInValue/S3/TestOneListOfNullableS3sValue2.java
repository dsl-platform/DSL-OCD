package com.dslplatform.ocd.values.SinglePropertyInValue.S3;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneListOfNullableS3sValue2;

public class TestOneListOfNullableS3sValue2 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneListOfNullableS3sValue2.class.getDeclaredField(
                        "oneListOfNullableS3s").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                OneListOfNullableS3sValue2.class.getDeclaredField(
                        "oneListOfNullableS3s").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<com.dslplatform.storage.S3> oneListOfNullableS3s = null;
                }.getClass().getDeclaredField("oneListOfNullableS3s").getGenericType(),
                OneListOfNullableS3sValue2.class.getDeclaredField("oneListOfNullableS3s").getGenericType());
    }
}
