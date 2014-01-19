package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.LongTests;

import com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneSetOfNullableLongs_6;

public class TestOneSetOfNullableLongs_6 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneSetOfNullableLongs_6.class.getDeclaredField(
                        "oneSetOfNullableLongs").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                OneSetOfNullableLongs_6.class.getDeclaredField(
                        "oneSetOfNullableLongs").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<Long> oneSetOfNullableLongs = null;
                }.getClass().getDeclaredField("oneSetOfNullableLongs").getGenericType(),
                OneSetOfNullableLongs_6.class.getDeclaredField("oneSetOfNullableLongs").getGenericType());
    }
}
