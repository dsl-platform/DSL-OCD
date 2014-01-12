package com.dslplatform.ocd.values.SinglePropertyInValue.Url;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfOneUrlsValue1;
import org.scalatest._;

public class TestNullableSetOfOneUrlsValue1 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableSetOfOneUrlsValue1.class.getDeclaredField(
                        "nullableSetOfOneUrls").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                NullableSetOfOneUrlsValue1.class.getDeclaredField(
                        "nullableSetOfOneUrls").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<java.net.URL> nullableSetOfOneUrls = null;
                }.getClass().getDeclaredField("nullableSetOfOneUrls").getGenericType(),
                NullableSetOfOneUrlsValue1.class.getDeclaredField("nullableSetOfOneUrls").getGenericType());
    }
}
