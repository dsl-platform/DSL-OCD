package com.dslplatform.ocd.values.SinglePropertyInValue.Guid;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneSetOfOneGuidsValue4;
import org.scalatest._;

public class TestOneSetOfOneGuidsValue4 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneSetOfOneGuidsValue4.class.getDeclaredField(
                        "oneSetOfOneGuids").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                OneSetOfOneGuidsValue4.class.getDeclaredField(
                        "oneSetOfOneGuids").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<java.util.UUID> oneSetOfOneGuids = null;
                }.getClass().getDeclaredField("oneSetOfOneGuids").getGenericType(),
                OneSetOfOneGuidsValue4.class.getDeclaredField("oneSetOfOneGuids").getGenericType());
    }
}
