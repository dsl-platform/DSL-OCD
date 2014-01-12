package com.dslplatform.ocd.values.SinglePropertyInValue.Date;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfOneDatesValue3;
import org.scalatest._;

public class TestNullableArrayOfOneDatesValue3 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableArrayOfOneDatesValue3.class.getDeclaredField(
                        "nullableArrayOfOneDates").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                org.joda.time.LocalDate[].class,
                NullableArrayOfOneDatesValue3.class.getDeclaredField(
                        "nullableArrayOfOneDates").getType());
    }
}
