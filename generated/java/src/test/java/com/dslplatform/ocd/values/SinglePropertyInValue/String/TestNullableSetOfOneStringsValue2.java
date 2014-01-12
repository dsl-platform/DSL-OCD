package com.dslplatform.ocd.values.SinglePropertyInValue.String;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfOneStringsValue2;
import org.scalatest._;

public class TestNullableSetOfOneStringsValue2 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableSetOfOneStringsValue2.class.getDeclaredField(
                        "nullableSetOfOneStrings").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                NullableSetOfOneStringsValue2.class.getDeclaredField(
                        "nullableSetOfOneStrings").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<String> nullableSetOfOneStrings = null;
                }.getClass().getDeclaredField("nullableSetOfOneStrings").getGenericType(),
                NullableSetOfOneStringsValue2.class.getDeclaredField("nullableSetOfOneStrings").getGenericType());
    }
}
