package com.dslplatform.ocd.values.SinglePropertyInValue.S3;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfOneS3sValue4;

public class TestOneArrayOfOneS3sValue4 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfOneS3sValue4.class.getDeclaredField(
                        "oneArrayOfOneS3s").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                com.dslplatform.storage.S3[].class,
                OneArrayOfOneS3sValue4.class.getDeclaredField(
                        "oneArrayOfOneS3s").getType());
    }
}
