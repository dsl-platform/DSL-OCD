package com.dslplatform.ocd.values.SinglePropertyInValue.UrlTests;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableUrlValue2;

public class TestNullableUrlValue2 {

    /* Testing the property field private access via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableUrlValue2.class.getDeclaredField(
                        "nullableUrl").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.net.URL.class,
                NullableUrlValue2.class.getDeclaredField(
                        "nullableUrl").getType());
    }
}
