package com.dslplatform.ocd.values.SinglePropertyInValue.Binary;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfOneBinariesValue1;
import org.scalatest._;

public class TestNullableArrayOfOneBinariesValue1 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableArrayOfOneBinariesValue1.class.getDeclaredField(
                        "nullableArrayOfOneBinaries").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                byte[][].class,
                NullableArrayOfOneBinariesValue1.class.getDeclaredField(
                        "nullableArrayOfOneBinaries").getType());
    }
}
