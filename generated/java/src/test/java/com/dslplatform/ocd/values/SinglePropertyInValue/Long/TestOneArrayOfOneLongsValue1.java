package com.dslplatform.ocd.values.SinglePropertyInValue.Long;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfOneLongsValue1;
import org.scalatest._;

public class TestOneArrayOfOneLongsValue1 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfOneLongsValue1.class.getDeclaredField(
                        "oneArrayOfOneLongs").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                long[].class,
                OneArrayOfOneLongsValue1.class.getDeclaredField(
                        "oneArrayOfOneLongs").getType());
    }
}
