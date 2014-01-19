package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.LongTests;

import com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneSetOfOneLongs_6;

public class TestOneSetOfOneLongs_6 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneSetOfOneLongs_6.class.getDeclaredField(
                        "oneSetOfOneLongs").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                OneSetOfOneLongs_6.class.getDeclaredField(
                        "oneSetOfOneLongs").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<Long> oneSetOfOneLongs = null;
                }.getClass().getDeclaredField("oneSetOfOneLongs").getGenericType(),
                OneSetOfOneLongs_6.class.getDeclaredField("oneSetOfOneLongs").getGenericType());
    }
}
