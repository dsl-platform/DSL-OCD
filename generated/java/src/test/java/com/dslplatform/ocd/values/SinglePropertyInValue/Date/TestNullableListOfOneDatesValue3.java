package com.dslplatform.ocd.values.SinglePropertyInValue.Date;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableListOfOneDatesValue3;
import org.scalatest._;

public class TestNullableListOfOneDatesValue3 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableListOfOneDatesValue3.class.getDeclaredField(
                        "nullableListOfOneDates").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                NullableListOfOneDatesValue3.class.getDeclaredField(
                        "nullableListOfOneDates").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<org.joda.time.LocalDate> nullableListOfOneDates = null;
                }.getClass().getDeclaredField("nullableListOfOneDates").getGenericType(),
                NullableListOfOneDatesValue3.class.getDeclaredField("nullableListOfOneDates").getGenericType());
    }
}
