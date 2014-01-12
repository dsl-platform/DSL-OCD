package com.dslplatform.ocd.values.SinglePropertyInValue.Text;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfOneTextsValue3;
import org.scalatest._;

public class TestNullableSetOfOneTextsValue3 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableSetOfOneTextsValue3.class.getDeclaredField(
                        "nullableSetOfOneTexts").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                NullableSetOfOneTextsValue3.class.getDeclaredField(
                        "nullableSetOfOneTexts").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<String> nullableSetOfOneTexts = null;
                }.getClass().getDeclaredField("nullableSetOfOneTexts").getGenericType(),
                NullableSetOfOneTextsValue3.class.getDeclaredField("nullableSetOfOneTexts").getGenericType());
    }
}
