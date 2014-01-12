package com.dslplatform.ocd.values.SinglePropertyInValue.Text;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfNullableTextsValue6;
import org.scalatest._;

public class TestOneArrayOfNullableTextsValue6 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfNullableTextsValue6.class.getDeclaredField(
                        "oneArrayOfNullableTexts").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                String[].class,
                OneArrayOfNullableTextsValue6.class.getDeclaredField(
                        "oneArrayOfNullableTexts").getType());
    }
}
