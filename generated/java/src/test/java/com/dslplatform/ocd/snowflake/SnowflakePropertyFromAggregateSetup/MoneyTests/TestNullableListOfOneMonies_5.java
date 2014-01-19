package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.MoneyTests;

import com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableListOfOneMonies_5;

public class TestNullableListOfOneMonies_5 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableListOfOneMonies_5.class.getDeclaredField(
                        "nullableListOfOneMonies").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                NullableListOfOneMonies_5.class.getDeclaredField(
                        "nullableListOfOneMonies").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<java.math.BigDecimal> nullableListOfOneMonies = null;
                }.getClass().getDeclaredField("nullableListOfOneMonies").getGenericType(),
                NullableListOfOneMonies_5.class.getDeclaredField("nullableListOfOneMonies").getGenericType());
    }
}
