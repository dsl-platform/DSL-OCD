package com.dslplatform.ocd.values.SinglePropertyInValue.Url;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneSetOfNullableUrlsValue1;
import org.scalatest._;

public class TestOneSetOfNullableUrlsValue1 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneSetOfNullableUrlsValue1.class.getDeclaredField(
                        "oneSetOfNullableUrls").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                OneSetOfNullableUrlsValue1.class.getDeclaredField(
                        "oneSetOfNullableUrls").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<java.net.URL> oneSetOfNullableUrls = null;
                }.getClass().getDeclaredField("oneSetOfNullableUrls").getGenericType(),
                OneSetOfNullableUrlsValue1.class.getDeclaredField("oneSetOfNullableUrls").getGenericType());
    }
}
