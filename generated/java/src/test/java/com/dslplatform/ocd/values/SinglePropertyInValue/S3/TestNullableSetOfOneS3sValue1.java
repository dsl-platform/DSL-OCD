package com.dslplatform.ocd.values.SinglePropertyInValue.S3;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfOneS3sValue1;

public class TestNullableSetOfOneS3sValue1 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableSetOfOneS3sValue1.class.getDeclaredField(
                        "nullableSetOfOneS3s").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                NullableSetOfOneS3sValue1.class.getDeclaredField(
                        "nullableSetOfOneS3s").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<com.dslplatform.storage.S3> nullableSetOfOneS3s = null;
                }.getClass().getDeclaredField("nullableSetOfOneS3s").getGenericType(),
                NullableSetOfOneS3sValue1.class.getDeclaredField("nullableSetOfOneS3s").getGenericType());
    }
}
