package com.dslplatform.ocd.values.SinglePropertyInValue.Date;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfNullableDatesValue3;
import org.scalatest._;

public class TestNullableSetOfNullableDatesValue3 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableSetOfNullableDatesValue3.class.getDeclaredField(
                        "nullableSetOfNullableDates").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                NullableSetOfNullableDatesValue3.class.getDeclaredField(
                        "nullableSetOfNullableDates").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<org.joda.time.LocalDate> nullableSetOfNullableDates = null;
                }.getClass().getDeclaredField("nullableSetOfNullableDates").getGenericType(),
                NullableSetOfNullableDatesValue3.class.getDeclaredField("nullableSetOfNullableDates").getGenericType());
    }
}
