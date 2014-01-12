package com.dslplatform.ocd.values.SinglePropertyInValue.Date;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneSetOfNullableDatesValue2;
import org.scalatest._;

public class TestOneSetOfNullableDatesValue2 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneSetOfNullableDatesValue2.class.getDeclaredField(
                        "oneSetOfNullableDates").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                OneSetOfNullableDatesValue2.class.getDeclaredField(
                        "oneSetOfNullableDates").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<org.joda.time.LocalDate> oneSetOfNullableDates = null;
                }.getClass().getDeclaredField("oneSetOfNullableDates").getGenericType(),
                OneSetOfNullableDatesValue2.class.getDeclaredField("oneSetOfNullableDates").getGenericType());
    }
}
