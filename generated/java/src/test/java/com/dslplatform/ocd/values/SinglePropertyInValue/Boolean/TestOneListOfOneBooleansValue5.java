package com.dslplatform.ocd.values.SinglePropertyInValue.Boolean;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneListOfOneBooleansValue5;
import org.scalatest._;

public class TestOneListOfOneBooleansValue5 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneListOfOneBooleansValue5.class.getDeclaredField(
                        "oneListOfOneBooleans").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                OneListOfOneBooleansValue5.class.getDeclaredField(
                        "oneListOfOneBooleans").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<Boolean> oneListOfOneBooleans = null;
                }.getClass().getDeclaredField("oneListOfOneBooleans").getGenericType(),
                OneListOfOneBooleansValue5.class.getDeclaredField("oneListOfOneBooleans").getGenericType());
    }
}
