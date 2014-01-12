package com.dslplatform.ocd.values.SinglePropertyInValue.Text;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfOneTextsValue1;
import org.scalatest._;

public class TestOneArrayOfOneTextsValue1 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfOneTextsValue1.class.getDeclaredField(
                        "oneArrayOfOneTexts").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                String[].class,
                OneArrayOfOneTextsValue1.class.getDeclaredField(
                        "oneArrayOfOneTexts").getType());
    }
}
