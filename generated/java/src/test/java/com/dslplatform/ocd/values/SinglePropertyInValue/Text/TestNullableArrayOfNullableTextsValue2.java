package com.dslplatform.ocd.values.SinglePropertyInValue.Text;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfNullableTextsValue2;
import org.scalatest._;

public class TestNullableArrayOfNullableTextsValue2 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableArrayOfNullableTextsValue2.class.getDeclaredField(
                        "nullableArrayOfNullableTexts").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                String[].class,
                NullableArrayOfNullableTextsValue2.class.getDeclaredField(
                        "nullableArrayOfNullableTexts").getType());
    }
}
