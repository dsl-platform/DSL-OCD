package com.dslplatform.ocd.values.SinglePropertyInValue.S3;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableListOfNullableS3sValue1;

public class TestNullableListOfNullableS3sValue1 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableListOfNullableS3sValue1.class.getDeclaredField(
                        "nullableListOfNullableS3s").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                NullableListOfNullableS3sValue1.class.getDeclaredField(
                        "nullableListOfNullableS3s").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<com.dslplatform.storage.S3> nullableListOfNullableS3s = null;
                }.getClass().getDeclaredField("nullableListOfNullableS3s").getGenericType(),
                NullableListOfNullableS3sValue1.class.getDeclaredField("nullableListOfNullableS3s").getGenericType());
    }
}
