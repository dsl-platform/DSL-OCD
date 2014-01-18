package com.dslplatform.ocd.values.PropertyInValue.MoneyTests;

import com.dslplatform.ocd.values.PropertyInValue.NullableListOfOneMonies_1;

public class TestNullableListOfOneMonies_1 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableListOfOneMonies_1.class.getDeclaredField(
                        "nullableListOfOneMonies").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                NullableListOfOneMonies_1.class.getDeclaredField(
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
                NullableListOfOneMonies_1.class.getDeclaredField("nullableListOfOneMonies").getGenericType());
    }
}
