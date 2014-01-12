package com.dslplatform.ocd.values.SinglePropertyInValue.S3;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneListOfOneS3sValue1;

public class TestOneListOfOneS3sValue1 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneListOfOneS3sValue1.class.getDeclaredField(
                        "oneListOfOneS3s").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                OneListOfOneS3sValue1.class.getDeclaredField(
                        "oneListOfOneS3s").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<com.dslplatform.storage.S3> oneListOfOneS3s = null;
                }.getClass().getDeclaredField("oneListOfOneS3s").getGenericType(),
                OneListOfOneS3sValue1.class.getDeclaredField("oneListOfOneS3s").getGenericType());
    }
}
