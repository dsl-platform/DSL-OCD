package com.dslplatform.ocd.values.SinglePropertyInValue.Date;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneSetOfOneDatesValue1;
import org.scalatest._;

public class TestOneSetOfOneDatesValue1 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneSetOfOneDatesValue1.class.getDeclaredField(
                        "oneSetOfOneDates").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                OneSetOfOneDatesValue1.class.getDeclaredField(
                        "oneSetOfOneDates").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<org.joda.time.LocalDate> oneSetOfOneDates = null;
                }.getClass().getDeclaredField("oneSetOfOneDates").getGenericType(),
                OneSetOfOneDatesValue1.class.getDeclaredField("oneSetOfOneDates").getGenericType());
    }
}
