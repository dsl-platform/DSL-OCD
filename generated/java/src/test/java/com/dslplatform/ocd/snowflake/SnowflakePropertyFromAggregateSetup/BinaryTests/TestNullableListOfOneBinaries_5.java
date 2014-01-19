package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.BinaryTests;

import com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableListOfOneBinaries_5;

public class TestNullableListOfOneBinaries_5 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableListOfOneBinaries_5.class.getDeclaredField(
                        "nullableListOfOneBinaries").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                NullableListOfOneBinaries_5.class.getDeclaredField(
                        "nullableListOfOneBinaries").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<byte[]> nullableListOfOneBinaries = null;
                }.getClass().getDeclaredField("nullableListOfOneBinaries").getGenericType(),
                NullableListOfOneBinaries_5.class.getDeclaredField("nullableListOfOneBinaries").getGenericType());
    }
}
