package com.dslplatform.ocd.values.SinglePropertyInValue.Boolean;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneSetOfOneBooleansValue5;
import org.scalatest._;

public class TestOneSetOfOneBooleansValue5 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneSetOfOneBooleansValue5.class.getDeclaredField(
                        "oneSetOfOneBooleans").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                OneSetOfOneBooleansValue5.class.getDeclaredField(
                        "oneSetOfOneBooleans").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<Boolean> oneSetOfOneBooleans = null;
                }.getClass().getDeclaredField("oneSetOfOneBooleans").getGenericType(),
                OneSetOfOneBooleansValue5.class.getDeclaredField("oneSetOfOneBooleans").getGenericType());
    }
}
