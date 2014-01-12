package com.dslplatform.ocd.values.SinglePropertyInValue.Guid;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneListOfNullableGuidsValue1;
import org.scalatest._;

public class TestOneListOfNullableGuidsValue1 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneListOfNullableGuidsValue1.class.getDeclaredField(
                        "oneListOfNullableGuids").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                OneListOfNullableGuidsValue1.class.getDeclaredField(
                        "oneListOfNullableGuids").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<java.util.UUID> oneListOfNullableGuids = null;
                }.getClass().getDeclaredField("oneListOfNullableGuids").getGenericType(),
                OneListOfNullableGuidsValue1.class.getDeclaredField("oneListOfNullableGuids").getGenericType());
    }
}
