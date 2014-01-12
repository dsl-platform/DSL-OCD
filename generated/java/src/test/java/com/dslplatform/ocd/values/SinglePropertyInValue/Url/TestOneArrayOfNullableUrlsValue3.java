package com.dslplatform.ocd.values.SinglePropertyInValue.Url;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfNullableUrlsValue3;
import org.scalatest._;

public class TestOneArrayOfNullableUrlsValue3 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfNullableUrlsValue3.class.getDeclaredField(
                        "oneArrayOfNullableUrls").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.net.URL[].class,
                OneArrayOfNullableUrlsValue3.class.getDeclaredField(
                        "oneArrayOfNullableUrls").getType());
    }
}
