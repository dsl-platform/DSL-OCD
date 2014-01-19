package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.GuidTests;

import com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableListOfNullableGuids_5;

public class TestNullableListOfNullableGuids_5 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableListOfNullableGuids_5.class.getDeclaredField(
                        "nullableListOfNullableGuids").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                NullableListOfNullableGuids_5.class.getDeclaredField(
                        "nullableListOfNullableGuids").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<java.util.UUID> nullableListOfNullableGuids = null;
                }.getClass().getDeclaredField("nullableListOfNullableGuids").getGenericType(),
                NullableListOfNullableGuids_5.class.getDeclaredField("nullableListOfNullableGuids").getGenericType());
    }
}
