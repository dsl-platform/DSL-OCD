package com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.FloatTests;

import com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneArrayOfOneFloats_2;

public class TestOneArrayOfOneFloats_2 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfOneFloats_2.class.getDeclaredField(
                        "oneArrayOfOneFloats").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                float[].class,
                OneArrayOfOneFloats_2.class.getDeclaredField(
                        "oneArrayOfOneFloats").getType());
    }
}
