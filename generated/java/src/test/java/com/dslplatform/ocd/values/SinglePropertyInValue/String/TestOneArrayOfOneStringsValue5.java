package com.dslplatform.ocd.values.SinglePropertyInValue.String;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfOneStringsValue5;
import org.scalatest._;

public class TestOneArrayOfOneStringsValue5 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfOneStringsValue5.class.getDeclaredField(
                        "oneArrayOfOneStrings").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                String[].class,
                OneArrayOfOneStringsValue5.class.getDeclaredField(
                        "oneArrayOfOneStrings").getType());
    }
}
