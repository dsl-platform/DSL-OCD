package com.dslplatform.ocd.values.SinglePropertyInValue.String;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneSetOfNullableStringsValue3;
import org.scalatest._;

public class TestOneSetOfNullableStringsValue3 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneSetOfNullableStringsValue3.class.getDeclaredField(
                        "oneSetOfNullableStrings").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                OneSetOfNullableStringsValue3.class.getDeclaredField(
                        "oneSetOfNullableStrings").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<String> oneSetOfNullableStrings = null;
                }.getClass().getDeclaredField("oneSetOfNullableStrings").getGenericType(),
                OneSetOfNullableStringsValue3.class.getDeclaredField("oneSetOfNullableStrings").getGenericType());
    }
}
