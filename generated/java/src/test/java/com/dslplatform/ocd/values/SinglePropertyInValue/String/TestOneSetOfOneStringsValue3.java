package com.dslplatform.ocd.values.SinglePropertyInValue.String;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneSetOfOneStringsValue3;
import org.scalatest._;

public class TestOneSetOfOneStringsValue3 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneSetOfOneStringsValue3.class.getDeclaredField(
                        "oneSetOfOneStrings").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                OneSetOfOneStringsValue3.class.getDeclaredField(
                        "oneSetOfOneStrings").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<String> oneSetOfOneStrings = null;
                }.getClass().getDeclaredField("oneSetOfOneStrings").getGenericType(),
                OneSetOfOneStringsValue3.class.getDeclaredField("oneSetOfOneStrings").getGenericType());
    }
}
