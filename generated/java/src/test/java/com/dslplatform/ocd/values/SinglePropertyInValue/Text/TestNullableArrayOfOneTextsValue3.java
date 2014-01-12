package com.dslplatform.ocd.values.SinglePropertyInValue.Text;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfOneTextsValue3;
import org.scalatest._;

public class TestNullableArrayOfOneTextsValue3 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableArrayOfOneTextsValue3.class.getDeclaredField(
                        "nullableArrayOfOneTexts").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                String[].class,
                NullableArrayOfOneTextsValue3.class.getDeclaredField(
                        "nullableArrayOfOneTexts").getType());
    }
}
