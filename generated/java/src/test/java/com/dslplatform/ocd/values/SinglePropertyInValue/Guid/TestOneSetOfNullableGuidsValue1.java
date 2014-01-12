package com.dslplatform.ocd.values.SinglePropertyInValue.Guid;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneSetOfNullableGuidsValue1;
import org.scalatest._;

public class TestOneSetOfNullableGuidsValue1 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneSetOfNullableGuidsValue1.class.getDeclaredField(
                        "oneSetOfNullableGuids").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                OneSetOfNullableGuidsValue1.class.getDeclaredField(
                        "oneSetOfNullableGuids").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<java.util.UUID> oneSetOfNullableGuids = null;
                }.getClass().getDeclaredField("oneSetOfNullableGuids").getGenericType(),
                OneSetOfNullableGuidsValue1.class.getDeclaredField("oneSetOfNullableGuids").getGenericType());
    }
}
