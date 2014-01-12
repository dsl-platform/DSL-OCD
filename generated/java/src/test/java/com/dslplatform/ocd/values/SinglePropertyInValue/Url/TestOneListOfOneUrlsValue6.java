package com.dslplatform.ocd.values.SinglePropertyInValue.Url;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneListOfOneUrlsValue6;
import org.scalatest._;

public class TestOneListOfOneUrlsValue6 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneListOfOneUrlsValue6.class.getDeclaredField(
                        "oneListOfOneUrls").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                OneListOfOneUrlsValue6.class.getDeclaredField(
                        "oneListOfOneUrls").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<java.net.URL> oneListOfOneUrls = null;
                }.getClass().getDeclaredField("oneListOfOneUrls").getGenericType(),
                OneListOfOneUrlsValue6.class.getDeclaredField("oneListOfOneUrls").getGenericType());
    }
}
