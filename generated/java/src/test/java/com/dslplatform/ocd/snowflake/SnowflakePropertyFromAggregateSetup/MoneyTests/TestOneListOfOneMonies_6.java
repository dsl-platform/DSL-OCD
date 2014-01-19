package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.MoneyTests;

import com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneListOfOneMonies_6;

public class TestOneListOfOneMonies_6 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneListOfOneMonies_6.class.getDeclaredField(
                        "oneListOfOneMonies").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                OneListOfOneMonies_6.class.getDeclaredField(
                        "oneListOfOneMonies").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<java.math.BigDecimal> oneListOfOneMonies = null;
                }.getClass().getDeclaredField("oneListOfOneMonies").getGenericType(),
                OneListOfOneMonies_6.class.getDeclaredField("oneListOfOneMonies").getGenericType());
    }
}
