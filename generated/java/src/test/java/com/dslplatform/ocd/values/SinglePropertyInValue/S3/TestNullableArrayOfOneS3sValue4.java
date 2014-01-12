package com.dslplatform.ocd.values.SinglePropertyInValue.S3;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfOneS3sValue4;

public class TestNullableArrayOfOneS3sValue4 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableArrayOfOneS3sValue4.class.getDeclaredField(
                        "nullableArrayOfOneS3s").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                com.dslplatform.storage.S3[].class,
                NullableArrayOfOneS3sValue4.class.getDeclaredField(
                        "nullableArrayOfOneS3s").getType());
    }
}
