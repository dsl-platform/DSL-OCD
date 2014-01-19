package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.StringTests;

import com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableListOfOneStrings_5;

public class TestNullableListOfOneStrings_5 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableListOfOneStrings_5.class.getDeclaredField(
                        "nullableListOfOneStrings").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                NullableListOfOneStrings_5.class.getDeclaredField(
                        "nullableListOfOneStrings").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<String> nullableListOfOneStrings = null;
                }.getClass().getDeclaredField("nullableListOfOneStrings").getGenericType(),
                NullableListOfOneStrings_5.class.getDeclaredField("nullableListOfOneStrings").getGenericType());
    }
}
