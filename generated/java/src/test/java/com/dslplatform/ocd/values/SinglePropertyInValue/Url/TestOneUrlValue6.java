package com.dslplatform.ocd.values.SinglePropertyInValue.Url;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneUrlValue6;
import org.scalatest._;

public class TestOneUrlValue6 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneUrlValue6.class.getDeclaredField(
                        "oneUrl").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.net.URL.class,
                OneUrlValue6.class.getDeclaredField(
                        "oneUrl").getType());
    }
}
