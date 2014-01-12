package com.dslplatform.ocd.values.SinglePropertyInValue.Url;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfOneUrlsValue3;
import org.scalatest._;

public class TestOneArrayOfOneUrlsValue3 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfOneUrlsValue3.class.getDeclaredField(
                        "oneArrayOfOneUrls").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.net.URL[].class,
                OneArrayOfOneUrlsValue3.class.getDeclaredField(
                        "oneArrayOfOneUrls").getType());
    }
}
