package com.dslplatform.ocd.values.SinglePropertyInValue.StringTests;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfNullableStringsValue3;

public class TestNullableSetOfNullableStringsValue3 {

    /* Testing the property field private access via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableSetOfNullableStringsValue3.class.getDeclaredField(
                        "nullableSetOfNullableStrings").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                NullableSetOfNullableStringsValue3.class.getDeclaredField(
                        "nullableSetOfNullableStrings").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<String> nullableSetOfNullableStrings = null;
                }.getClass().getDeclaredField("nullableSetOfNullableStrings").getGenericType(),
                NullableSetOfNullableStringsValue3.class.getDeclaredField("nullableSetOfNullableStrings").getGenericType());
    }
}
