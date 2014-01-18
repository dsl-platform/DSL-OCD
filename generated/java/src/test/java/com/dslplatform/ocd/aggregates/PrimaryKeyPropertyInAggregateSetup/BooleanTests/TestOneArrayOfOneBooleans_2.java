package com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.BooleanTests;

import com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneArrayOfOneBooleans_2;

public class TestOneArrayOfOneBooleans_2 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfOneBooleans_2.class.getDeclaredField(
                        "oneArrayOfOneBooleans").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                boolean[].class,
                OneArrayOfOneBooleans_2.class.getDeclaredField(
                        "oneArrayOfOneBooleans").getType());
    }
}
