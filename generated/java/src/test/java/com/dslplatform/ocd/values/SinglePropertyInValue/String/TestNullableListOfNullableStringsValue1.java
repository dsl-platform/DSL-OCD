package com.dslplatform.ocd.values.SinglePropertyInValue.String;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableListOfNullableStringsValue1;
import org.scalatest._;

public class TestNullableListOfNullableStringsValue1 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableListOfNullableStringsValue1.class.getDeclaredField(
                        "nullableListOfNullableStrings").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                NullableListOfNullableStringsValue1.class.getDeclaredField(
                        "nullableListOfNullableStrings").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<String> nullableListOfNullableStrings = null;
                }.getClass().getDeclaredField("nullableListOfNullableStrings").getGenericType(),
                NullableListOfNullableStringsValue1.class.getDeclaredField("nullableListOfNullableStrings").getGenericType());
    }
}
