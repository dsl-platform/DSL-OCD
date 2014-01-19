package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.MapTests;

import com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneSetOfOneMaps_6;

public class TestOneSetOfOneMaps_6 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneSetOfOneMaps_6.class.getDeclaredField(
                        "oneSetOfOneMaps").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                OneSetOfOneMaps_6.class.getDeclaredField(
                        "oneSetOfOneMaps").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<java.util.Map<String, String>> oneSetOfOneMaps = null;
                }.getClass().getDeclaredField("oneSetOfOneMaps").getGenericType(),
                OneSetOfOneMaps_6.class.getDeclaredField("oneSetOfOneMaps").getGenericType());
    }
}
