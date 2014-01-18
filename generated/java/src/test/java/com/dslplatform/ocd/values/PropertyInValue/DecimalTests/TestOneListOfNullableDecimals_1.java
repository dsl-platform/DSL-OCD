package com.dslplatform.ocd.values.PropertyInValue.DecimalTests;

import com.dslplatform.ocd.values.PropertyInValue.OneListOfNullableDecimals_1;

public class TestOneListOfNullableDecimals_1 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneListOfNullableDecimals_1.class.getDeclaredField(
                        "oneListOfNullableDecimals").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                OneListOfNullableDecimals_1.class.getDeclaredField(
                        "oneListOfNullableDecimals").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<java.math.BigDecimal> oneListOfNullableDecimals = null;
                }.getClass().getDeclaredField("oneListOfNullableDecimals").getGenericType(),
                OneListOfNullableDecimals_1.class.getDeclaredField("oneListOfNullableDecimals").getGenericType());
    }
}
