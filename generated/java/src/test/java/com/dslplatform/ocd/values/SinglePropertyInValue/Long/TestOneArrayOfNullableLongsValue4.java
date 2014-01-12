package com.dslplatform.ocd.values.SinglePropertyInValue.Long;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfNullableLongsValue4;
import org.scalatest._;

public class TestOneArrayOfNullableLongsValue4 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfNullableLongsValue4.class.getDeclaredField(
                        "oneArrayOfNullableLongs").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                Long[].class,
                OneArrayOfNullableLongsValue4.class.getDeclaredField(
                        "oneArrayOfNullableLongs").getType());
    }
}
