package com.dslplatform.ocd.values.SinglePropertyInValue.Url;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableListOfOneUrlsValue3;
import org.scalatest._;

public class TestNullableListOfOneUrlsValue3 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableListOfOneUrlsValue3.class.getDeclaredField(
                        "nullableListOfOneUrls").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                NullableListOfOneUrlsValue3.class.getDeclaredField(
                        "nullableListOfOneUrls").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<java.net.URL> nullableListOfOneUrls = null;
                }.getClass().getDeclaredField("nullableListOfOneUrls").getGenericType(),
                NullableListOfOneUrlsValue3.class.getDeclaredField("nullableListOfOneUrls").getGenericType());
    }
}
