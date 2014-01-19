package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.DecimalTests;

import com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableSetOfNullableDecimals_5;

public class TestNullableSetOfNullableDecimals_5 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableSetOfNullableDecimals_5.class.getDeclaredField(
                        "nullableSetOfNullableDecimals").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                NullableSetOfNullableDecimals_5.class.getDeclaredField(
                        "nullableSetOfNullableDecimals").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<java.math.BigDecimal> nullableSetOfNullableDecimals = null;
                }.getClass().getDeclaredField("nullableSetOfNullableDecimals").getGenericType(),
                NullableSetOfNullableDecimals_5.class.getDeclaredField("nullableSetOfNullableDecimals").getGenericType());
    }
}
