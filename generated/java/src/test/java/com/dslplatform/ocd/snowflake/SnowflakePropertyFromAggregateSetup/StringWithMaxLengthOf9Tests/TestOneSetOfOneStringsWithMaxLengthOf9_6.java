package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.StringWithMaxLengthOf9Tests;

import com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneSetOfOneStringsWithMaxLengthOf9_6;

public class TestOneSetOfOneStringsWithMaxLengthOf9_6 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneSetOfOneStringsWithMaxLengthOf9_6.class.getDeclaredField(
                        "oneSetOfOneStringsWithMaxLengthOf9").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                OneSetOfOneStringsWithMaxLengthOf9_6.class.getDeclaredField(
                        "oneSetOfOneStringsWithMaxLengthOf9").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<String> oneSetOfOneStringsWithMaxLengthOf9 = null;
                }.getClass().getDeclaredField("oneSetOfOneStringsWithMaxLengthOf9").getGenericType(),
                OneSetOfOneStringsWithMaxLengthOf9_6.class.getDeclaredField("oneSetOfOneStringsWithMaxLengthOf9").getGenericType());
    }
}
