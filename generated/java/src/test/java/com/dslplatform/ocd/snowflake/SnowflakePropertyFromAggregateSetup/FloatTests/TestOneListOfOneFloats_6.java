package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.FloatTests;

import com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneListOfOneFloats_6;

public class TestOneListOfOneFloats_6 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneListOfOneFloats_6.class.getDeclaredField(
                        "oneListOfOneFloats").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                OneListOfOneFloats_6.class.getDeclaredField(
                        "oneListOfOneFloats").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<Float> oneListOfOneFloats = null;
                }.getClass().getDeclaredField("oneListOfOneFloats").getGenericType(),
                OneListOfOneFloats_6.class.getDeclaredField("oneListOfOneFloats").getGenericType());
    }
}
