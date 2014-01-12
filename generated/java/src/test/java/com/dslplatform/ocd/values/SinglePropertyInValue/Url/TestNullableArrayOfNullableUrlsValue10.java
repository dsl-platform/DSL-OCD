package com.dslplatform.ocd.values.SinglePropertyInValue.Url;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfNullableUrlsValue10;
import org.scalatest._;

public class TestNullableArrayOfNullableUrlsValue10 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableArrayOfNullableUrlsValue10.class.getDeclaredField(
                        "nullableArrayOfNullableUrls").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.net.URL[].class,
                NullableArrayOfNullableUrlsValue10.class.getDeclaredField(
                        "nullableArrayOfNullableUrls").getType());
    }
}
