package com.dslplatform.ocd.values.SinglePropertyInValue.Money;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfOneMoniesValue3;
import org.scalatest._;

public class TestNullableSetOfOneMoniesValue3 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableSetOfOneMoniesValue3.class.getDeclaredField(
                        "nullableSetOfOneMonies").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                NullableSetOfOneMoniesValue3.class.getDeclaredField(
                        "nullableSetOfOneMonies").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<java.math.BigDecimal> nullableSetOfOneMonies = null;
                }.getClass().getDeclaredField("nullableSetOfOneMonies").getGenericType(),
                NullableSetOfOneMoniesValue3.class.getDeclaredField("nullableSetOfOneMonies").getGenericType());
    }
}
