package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.LongTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.NullableArrayOfOneLongs_4;

public class TestNullableArrayOfOneLongs_4 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableArrayOfOneLongs_4.class.getDeclaredField(
                        "nullableArrayOfOneLongs").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                long[].class,
                NullableArrayOfOneLongs_4.class.getDeclaredField(
                        "nullableArrayOfOneLongs").getType());
    }
}
