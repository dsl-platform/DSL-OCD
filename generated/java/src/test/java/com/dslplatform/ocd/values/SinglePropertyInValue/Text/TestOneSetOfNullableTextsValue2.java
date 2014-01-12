package com.dslplatform.ocd.values.SinglePropertyInValue.Text;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneSetOfNullableTextsValue2;
import org.scalatest._;

public class TestOneSetOfNullableTextsValue2 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneSetOfNullableTextsValue2.class.getDeclaredField(
                        "oneSetOfNullableTexts").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                OneSetOfNullableTextsValue2.class.getDeclaredField(
                        "oneSetOfNullableTexts").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<String> oneSetOfNullableTexts = null;
                }.getClass().getDeclaredField("oneSetOfNullableTexts").getGenericType(),
                OneSetOfNullableTextsValue2.class.getDeclaredField("oneSetOfNullableTexts").getGenericType());
    }
}
