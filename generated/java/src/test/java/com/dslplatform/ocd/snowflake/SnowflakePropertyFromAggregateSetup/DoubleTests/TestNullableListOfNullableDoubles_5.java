package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.DoubleTests;

import com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableListOfNullableDoubles_5;

public class TestNullableListOfNullableDoubles_5 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableListOfNullableDoubles_5.class.getDeclaredField(
                        "nullableListOfNullableDoubles").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                NullableListOfNullableDoubles_5.class.getDeclaredField(
                        "nullableListOfNullableDoubles").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<Double> nullableListOfNullableDoubles = null;
                }.getClass().getDeclaredField("nullableListOfNullableDoubles").getGenericType(),
                NullableListOfNullableDoubles_5.class.getDeclaredField("nullableListOfNullableDoubles").getGenericType());
    }
}
