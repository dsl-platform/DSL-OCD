package com.dslplatform.ocd.values.SinglePropertyInValue.Url;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneListOfNullableUrlsValue2;
import org.scalatest._;

public class TestOneListOfNullableUrlsValue2 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneListOfNullableUrlsValue2.class.getDeclaredField(
                        "oneListOfNullableUrls").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                OneListOfNullableUrlsValue2.class.getDeclaredField(
                        "oneListOfNullableUrls").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<java.net.URL> oneListOfNullableUrls = null;
                }.getClass().getDeclaredField("oneListOfNullableUrls").getGenericType(),
                OneListOfNullableUrlsValue2.class.getDeclaredField("oneListOfNullableUrls").getGenericType());
    }
}
