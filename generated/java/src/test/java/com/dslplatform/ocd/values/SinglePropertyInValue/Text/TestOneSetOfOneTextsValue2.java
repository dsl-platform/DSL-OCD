package com.dslplatform.ocd.values.SinglePropertyInValue.Text;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneSetOfOneTextsValue2;
import org.scalatest._;

public class TestOneSetOfOneTextsValue2 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneSetOfOneTextsValue2.class.getDeclaredField(
                        "oneSetOfOneTexts").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                OneSetOfOneTextsValue2.class.getDeclaredField(
                        "oneSetOfOneTexts").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<String> oneSetOfOneTexts = null;
                }.getClass().getDeclaredField("oneSetOfOneTexts").getGenericType(),
                OneSetOfOneTextsValue2.class.getDeclaredField("oneSetOfOneTexts").getGenericType());
    }
}
