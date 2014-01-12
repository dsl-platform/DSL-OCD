package com.dslplatform.ocd.values.SinglePropertyInValue.Binary;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfOneBinariesValue6;
import org.scalatest._;

public class TestOneArrayOfOneBinariesValue6 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfOneBinariesValue6.class.getDeclaredField(
                        "oneArrayOfOneBinaries").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                byte[][].class,
                OneArrayOfOneBinariesValue6.class.getDeclaredField(
                        "oneArrayOfOneBinaries").getType());
    }
}
