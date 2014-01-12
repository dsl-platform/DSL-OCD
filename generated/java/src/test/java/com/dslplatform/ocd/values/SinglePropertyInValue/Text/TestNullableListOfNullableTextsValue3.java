package com.dslplatform.ocd.values.SinglePropertyInValue.Text;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableListOfNullableTextsValue3;
import org.scalatest._;

public class TestNullableListOfNullableTextsValue3 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableListOfNullableTextsValue3.class.getDeclaredField(
                        "nullableListOfNullableTexts").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                NullableListOfNullableTextsValue3.class.getDeclaredField(
                        "nullableListOfNullableTexts").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<String> nullableListOfNullableTexts = null;
                }.getClass().getDeclaredField("nullableListOfNullableTexts").getGenericType(),
                NullableListOfNullableTextsValue3.class.getDeclaredField("nullableListOfNullableTexts").getGenericType());
    }
}
