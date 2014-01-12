package com.dslplatform.ocd.values.SinglePropertyInValue.Date;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneListOfOneDatesValue1;
import org.scalatest._;

public class TestOneListOfOneDatesValue1 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneListOfOneDatesValue1.class.getDeclaredField(
                        "oneListOfOneDates").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                OneListOfOneDatesValue1.class.getDeclaredField(
                        "oneListOfOneDates").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<org.joda.time.LocalDate> oneListOfOneDates = null;
                }.getClass().getDeclaredField("oneListOfOneDates").getGenericType(),
                OneListOfOneDatesValue1.class.getDeclaredField("oneListOfOneDates").getGenericType());
    }
}
