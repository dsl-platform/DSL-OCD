package com.dslplatform.ocd.values.SinglePropertyInValue.Url;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfOneUrlsValue1;
import org.scalatest._;

public class TestOneArrayOfOneUrlsValue1 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfOneUrlsValue1.class.getDeclaredField(
                        "oneArrayOfOneUrls").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.net.URL[].class,
                OneArrayOfOneUrlsValue1.class.getDeclaredField(
                        "oneArrayOfOneUrls").getType());
    }
}
