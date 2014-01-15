package com.dslplatform.ocd.values.SinglePropertyInValue.TextTests;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneSetOfNullableTextsValue3;

public class TestOneSetOfNullableTextsValue3 {

    /* Testing the property field private access via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneSetOfNullableTextsValue3.class.getDeclaredField(
                        "oneSetOfNullableTexts").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                OneSetOfNullableTextsValue3.class.getDeclaredField(
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
                OneSetOfNullableTextsValue3.class.getDeclaredField("oneSetOfNullableTexts").getGenericType());
    }
}
