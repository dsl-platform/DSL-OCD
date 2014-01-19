package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.MoneyTests;

import com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneListOfNullableMonies_6;

public class TestOneListOfNullableMonies_6 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneListOfNullableMonies_6.class.getDeclaredField(
                        "oneListOfNullableMonies").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                OneListOfNullableMonies_6.class.getDeclaredField(
                        "oneListOfNullableMonies").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<java.math.BigDecimal> oneListOfNullableMonies = null;
                }.getClass().getDeclaredField("oneListOfNullableMonies").getGenericType(),
                OneListOfNullableMonies_6.class.getDeclaredField("oneListOfNullableMonies").getGenericType());
    }
}
