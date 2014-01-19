package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.FloatTests;

import com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableListOfNullableFloats_5;

public class TestNullableListOfNullableFloats_5 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableListOfNullableFloats_5.class.getDeclaredField(
                        "nullableListOfNullableFloats").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                NullableListOfNullableFloats_5.class.getDeclaredField(
                        "nullableListOfNullableFloats").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<Float> nullableListOfNullableFloats = null;
                }.getClass().getDeclaredField("nullableListOfNullableFloats").getGenericType(),
                NullableListOfNullableFloats_5.class.getDeclaredField("nullableListOfNullableFloats").getGenericType());
    }
}
