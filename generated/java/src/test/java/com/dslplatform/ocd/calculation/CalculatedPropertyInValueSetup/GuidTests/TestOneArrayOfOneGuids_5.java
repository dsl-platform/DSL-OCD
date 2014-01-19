package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.GuidTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.OneArrayOfOneGuids_5;

public class TestOneArrayOfOneGuids_5 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfOneGuids_5.class.getDeclaredField(
                        "oneArrayOfOneGuids").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.UUID[].class,
                OneArrayOfOneGuids_5.class.getDeclaredField(
                        "oneArrayOfOneGuids").getType());
    }
}
