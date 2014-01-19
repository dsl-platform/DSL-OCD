package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.StringTests;

import com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneSetOfNullableStrings_6;

public class TestOneSetOfNullableStrings_6 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneSetOfNullableStrings_6.class.getDeclaredField(
                        "oneSetOfNullableStrings").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                OneSetOfNullableStrings_6.class.getDeclaredField(
                        "oneSetOfNullableStrings").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<String> oneSetOfNullableStrings = null;
                }.getClass().getDeclaredField("oneSetOfNullableStrings").getGenericType(),
                OneSetOfNullableStrings_6.class.getDeclaredField("oneSetOfNullableStrings").getGenericType());
    }
}
