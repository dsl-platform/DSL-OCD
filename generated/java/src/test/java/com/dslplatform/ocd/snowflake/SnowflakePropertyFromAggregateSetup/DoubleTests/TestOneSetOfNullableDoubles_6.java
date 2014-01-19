package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.DoubleTests;

import com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneSetOfNullableDoubles_6;

public class TestOneSetOfNullableDoubles_6 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneSetOfNullableDoubles_6.class.getDeclaredField(
                        "oneSetOfNullableDoubles").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                OneSetOfNullableDoubles_6.class.getDeclaredField(
                        "oneSetOfNullableDoubles").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<Double> oneSetOfNullableDoubles = null;
                }.getClass().getDeclaredField("oneSetOfNullableDoubles").getGenericType(),
                OneSetOfNullableDoubles_6.class.getDeclaredField("oneSetOfNullableDoubles").getGenericType());
    }
}
