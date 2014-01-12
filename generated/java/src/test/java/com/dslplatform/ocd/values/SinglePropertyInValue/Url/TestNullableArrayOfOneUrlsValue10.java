package com.dslplatform.ocd.values.SinglePropertyInValue.Url;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfOneUrlsValue10;
import org.scalatest._;

public class TestNullableArrayOfOneUrlsValue10 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableArrayOfOneUrlsValue10.class.getDeclaredField(
                        "nullableArrayOfOneUrls").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.net.URL[].class,
                NullableArrayOfOneUrlsValue10.class.getDeclaredField(
                        "nullableArrayOfOneUrls").getType());
    }
}
