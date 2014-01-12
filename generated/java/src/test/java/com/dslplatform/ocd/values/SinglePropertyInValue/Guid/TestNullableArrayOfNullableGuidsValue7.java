package com.dslplatform.ocd.values.SinglePropertyInValue.Guid;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfNullableGuidsValue7;
import org.scalatest._;

public class TestNullableArrayOfNullableGuidsValue7 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableArrayOfNullableGuidsValue7.class.getDeclaredField(
                        "nullableArrayOfNullableGuids").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.UUID[].class,
                NullableArrayOfNullableGuidsValue7.class.getDeclaredField(
                        "nullableArrayOfNullableGuids").getType());
    }
}
