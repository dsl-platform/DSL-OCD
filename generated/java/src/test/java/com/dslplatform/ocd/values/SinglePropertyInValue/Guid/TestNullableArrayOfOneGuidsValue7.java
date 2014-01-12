package com.dslplatform.ocd.values.SinglePropertyInValue.Guid;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfOneGuidsValue7;
import org.scalatest._;

public class TestNullableArrayOfOneGuidsValue7 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableArrayOfOneGuidsValue7.class.getDeclaredField(
                        "nullableArrayOfOneGuids").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.UUID[].class,
                NullableArrayOfOneGuidsValue7.class.getDeclaredField(
                        "nullableArrayOfOneGuids").getType());
    }
}
