package com.dslplatform.ocd.values.SinglePropertyInValue.Binary;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfOneBinariesValue6;
import org.scalatest._;

public class TestNullableArrayOfOneBinariesValue6 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableArrayOfOneBinariesValue6.class.getDeclaredField(
                        "nullableArrayOfOneBinaries").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                byte[][].class,
                NullableArrayOfOneBinariesValue6.class.getDeclaredField(
                        "nullableArrayOfOneBinaries").getType());
    }
}
