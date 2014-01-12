package com.dslplatform.ocd.values.SinglePropertyInValue.Url;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfNullableUrlsValue6;
import org.scalatest._;

public class TestNullableSetOfNullableUrlsValue6 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableSetOfNullableUrlsValue6.class.getDeclaredField(
                        "nullableSetOfNullableUrls").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                NullableSetOfNullableUrlsValue6.class.getDeclaredField(
                        "nullableSetOfNullableUrls").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<java.net.URL> nullableSetOfNullableUrls = null;
                }.getClass().getDeclaredField("nullableSetOfNullableUrls").getGenericType(),
                NullableSetOfNullableUrlsValue6.class.getDeclaredField("nullableSetOfNullableUrls").getGenericType());
    }
}
