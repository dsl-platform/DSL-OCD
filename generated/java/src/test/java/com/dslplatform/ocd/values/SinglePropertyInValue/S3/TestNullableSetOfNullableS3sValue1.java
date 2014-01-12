package com.dslplatform.ocd.values.SinglePropertyInValue.S3;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfNullableS3sValue1;

public class TestNullableSetOfNullableS3sValue1 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableSetOfNullableS3sValue1.class.getDeclaredField(
                        "nullableSetOfNullableS3s").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                NullableSetOfNullableS3sValue1.class.getDeclaredField(
                        "nullableSetOfNullableS3s").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<com.dslplatform.storage.S3> nullableSetOfNullableS3s = null;
                }.getClass().getDeclaredField("nullableSetOfNullableS3s").getGenericType(),
                NullableSetOfNullableS3sValue1.class.getDeclaredField("nullableSetOfNullableS3s").getGenericType());
    }
}
