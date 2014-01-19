package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.XmlTests;

import com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableSetOfOneXmls_5;

public class TestNullableSetOfOneXmls_5 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableSetOfOneXmls_5.class.getDeclaredField(
                        "nullableSetOfOneXmls").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                NullableSetOfOneXmls_5.class.getDeclaredField(
                        "nullableSetOfOneXmls").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<org.w3c.dom.Element> nullableSetOfOneXmls = null;
                }.getClass().getDeclaredField("nullableSetOfOneXmls").getGenericType(),
                NullableSetOfOneXmls_5.class.getDeclaredField("nullableSetOfOneXmls").getGenericType());
    }
}
