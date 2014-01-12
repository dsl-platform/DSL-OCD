package com.dslplatform.ocd.values.SinglePropertyInValue.Money;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfNullableMoniesValue1;
import org.scalatest._;

public class TestNullableSetOfNullableMoniesValue1 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableSetOfNullableMoniesValue1.class.getDeclaredField(
                        "nullableSetOfNullableMonies").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                NullableSetOfNullableMoniesValue1.class.getDeclaredField(
                        "nullableSetOfNullableMonies").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<java.math.BigDecimal> nullableSetOfNullableMonies = null;
                }.getClass().getDeclaredField("nullableSetOfNullableMonies").getGenericType(),
                NullableSetOfNullableMoniesValue1.class.getDeclaredField("nullableSetOfNullableMonies").getGenericType());
    }
}
