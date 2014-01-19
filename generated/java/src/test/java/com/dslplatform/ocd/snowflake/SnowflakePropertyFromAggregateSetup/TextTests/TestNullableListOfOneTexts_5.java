package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.TextTests;

import com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableListOfOneTexts_5;

public class TestNullableListOfOneTexts_5 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableListOfOneTexts_5.class.getDeclaredField(
                        "nullableListOfOneTexts").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                NullableListOfOneTexts_5.class.getDeclaredField(
                        "nullableListOfOneTexts").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<String> nullableListOfOneTexts = null;
                }.getClass().getDeclaredField("nullableListOfOneTexts").getGenericType(),
                NullableListOfOneTexts_5.class.getDeclaredField("nullableListOfOneTexts").getGenericType());
    }
}
