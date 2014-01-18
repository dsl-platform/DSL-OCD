package com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.FloatTests;

import com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneFloat_2;

public class TestOneFloat_2 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneFloat_2.class.getDeclaredField(
                        "oneFloat").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                float.class,
                OneFloat_2.class.getDeclaredField(
                        "oneFloat").getType());
    }
}
