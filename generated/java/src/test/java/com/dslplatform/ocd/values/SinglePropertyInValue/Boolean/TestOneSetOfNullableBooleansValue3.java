package com.dslplatform.ocd.values.SinglePropertyInValue.Boolean;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneSetOfNullableBooleansValue3;
import org.scalatest._;

public class TestOneSetOfNullableBooleansValue3 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneSetOfNullableBooleansValue3.class.getDeclaredField(
                        "oneSetOfNullableBooleans").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                OneSetOfNullableBooleansValue3.class.getDeclaredField(
                        "oneSetOfNullableBooleans").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<Boolean> oneSetOfNullableBooleans = null;
                }.getClass().getDeclaredField("oneSetOfNullableBooleans").getGenericType(),
                OneSetOfNullableBooleansValue3.class.getDeclaredField("oneSetOfNullableBooleans").getGenericType());
    }
}
