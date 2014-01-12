package com.dslplatform.ocd.values.SinglePropertyInValue.Boolean;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableListOfNullableBooleansValue3;
import org.scalatest._;

public class TestNullableListOfNullableBooleansValue3 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableListOfNullableBooleansValue3.class.getDeclaredField(
                        "nullableListOfNullableBooleans").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                NullableListOfNullableBooleansValue3.class.getDeclaredField(
                        "nullableListOfNullableBooleans").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<Boolean> nullableListOfNullableBooleans = null;
                }.getClass().getDeclaredField("nullableListOfNullableBooleans").getGenericType(),
                NullableListOfNullableBooleansValue3.class.getDeclaredField("nullableListOfNullableBooleans").getGenericType());
    }
}
