package com.dslplatform.ocd.values.SinglePropertyInValue.Guid;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfNullableGuidsValue4;
import org.scalatest._;

public class TestNullableSetOfNullableGuidsValue4 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableSetOfNullableGuidsValue4.class.getDeclaredField(
                        "nullableSetOfNullableGuids").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                NullableSetOfNullableGuidsValue4.class.getDeclaredField(
                        "nullableSetOfNullableGuids").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<java.util.UUID> nullableSetOfNullableGuids = null;
                }.getClass().getDeclaredField("nullableSetOfNullableGuids").getGenericType(),
                NullableSetOfNullableGuidsValue4.class.getDeclaredField("nullableSetOfNullableGuids").getGenericType());
    }
}
