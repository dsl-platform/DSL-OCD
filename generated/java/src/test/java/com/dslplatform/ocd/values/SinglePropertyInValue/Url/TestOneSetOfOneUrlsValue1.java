package com.dslplatform.ocd.values.SinglePropertyInValue.Url;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneSetOfOneUrlsValue1;
import org.scalatest._;

public class TestOneSetOfOneUrlsValue1 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneSetOfOneUrlsValue1.class.getDeclaredField(
                        "oneSetOfOneUrls").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                OneSetOfOneUrlsValue1.class.getDeclaredField(
                        "oneSetOfOneUrls").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<java.net.URL> oneSetOfOneUrls = null;
                }.getClass().getDeclaredField("oneSetOfOneUrls").getGenericType(),
                OneSetOfOneUrlsValue1.class.getDeclaredField("oneSetOfOneUrls").getGenericType());
    }
}
