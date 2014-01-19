package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.StringTests;

import com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableSetOfOneStrings_5;

public class TestNullableSetOfOneStrings_5 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableSetOfOneStrings_5.class.getDeclaredField(
                        "nullableSetOfOneStrings").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                NullableSetOfOneStrings_5.class.getDeclaredField(
                        "nullableSetOfOneStrings").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<String> nullableSetOfOneStrings = null;
                }.getClass().getDeclaredField("nullableSetOfOneStrings").getGenericType(),
                NullableSetOfOneStrings_5.class.getDeclaredField("nullableSetOfOneStrings").getGenericType());
    }
}
