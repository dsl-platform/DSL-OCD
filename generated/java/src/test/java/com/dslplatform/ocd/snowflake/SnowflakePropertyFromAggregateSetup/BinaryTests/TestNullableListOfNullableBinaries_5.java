package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.BinaryTests;

import com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableListOfNullableBinaries_5;

public class TestNullableListOfNullableBinaries_5 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableListOfNullableBinaries_5.class.getDeclaredField(
                        "nullableListOfNullableBinaries").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                NullableListOfNullableBinaries_5.class.getDeclaredField(
                        "nullableListOfNullableBinaries").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<byte[]> nullableListOfNullableBinaries = null;
                }.getClass().getDeclaredField("nullableListOfNullableBinaries").getGenericType(),
                NullableListOfNullableBinaries_5.class.getDeclaredField("nullableListOfNullableBinaries").getGenericType());
    }
}
