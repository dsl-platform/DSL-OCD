package com.dslplatform.ocd.values.SinglePropertyInValue.Long;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfOneLongsValue4;
import org.scalatest._;

public class TestNullableArrayOfOneLongsValue4 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableArrayOfOneLongsValue4.class.getDeclaredField(
                        "nullableArrayOfOneLongs").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                long[].class,
                NullableArrayOfOneLongsValue4.class.getDeclaredField(
                        "nullableArrayOfOneLongs").getType());
    }
}
