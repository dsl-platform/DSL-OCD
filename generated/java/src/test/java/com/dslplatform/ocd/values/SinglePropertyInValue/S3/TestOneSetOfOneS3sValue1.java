package com.dslplatform.ocd.values.SinglePropertyInValue.S3;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneSetOfOneS3sValue1;

public class TestOneSetOfOneS3sValue1 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneSetOfOneS3sValue1.class.getDeclaredField(
                        "oneSetOfOneS3s").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                OneSetOfOneS3sValue1.class.getDeclaredField(
                        "oneSetOfOneS3s").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<com.dslplatform.storage.S3> oneSetOfOneS3s = null;
                }.getClass().getDeclaredField("oneSetOfOneS3s").getGenericType(),
                OneSetOfOneS3sValue1.class.getDeclaredField("oneSetOfOneS3s").getGenericType());
    }
}
