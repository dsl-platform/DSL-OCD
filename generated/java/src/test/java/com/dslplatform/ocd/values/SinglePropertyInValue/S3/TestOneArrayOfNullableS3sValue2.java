package com.dslplatform.ocd.values.SinglePropertyInValue.S3;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfNullableS3sValue2;

public class TestOneArrayOfNullableS3sValue2 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfNullableS3sValue2.class.getDeclaredField(
                        "oneArrayOfNullableS3s").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                com.dslplatform.storage.S3[].class,
                OneArrayOfNullableS3sValue2.class.getDeclaredField(
                        "oneArrayOfNullableS3s").getType());
    }
}
