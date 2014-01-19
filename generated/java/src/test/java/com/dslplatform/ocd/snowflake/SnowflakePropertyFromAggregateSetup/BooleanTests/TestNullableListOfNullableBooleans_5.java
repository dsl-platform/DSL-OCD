package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.BooleanTests;

import com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableListOfNullableBooleans_5;

public class TestNullableListOfNullableBooleans_5 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableListOfNullableBooleans_5.class.getDeclaredField(
                        "nullableListOfNullableBooleans").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                NullableListOfNullableBooleans_5.class.getDeclaredField(
                        "nullableListOfNullableBooleans").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<Boolean> nullableListOfNullableBooleans = null;
                }.getClass().getDeclaredField("nullableListOfNullableBooleans").getGenericType(),
                NullableListOfNullableBooleans_5.class.getDeclaredField("nullableListOfNullableBooleans").getGenericType());
    }
}
