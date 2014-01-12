package com.dslplatform.ocd.values.SinglePropertyInValue.StringWithMaxLengthOf9;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneStringWithMaxLengthOf9Value2;
import org.scalatest._;

public class TestOneStringWithMaxLengthOf9Value2 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneStringWithMaxLengthOf9Value2.class.getDeclaredField(
                        "oneStringWithMaxLengthOf9").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                String.class,
                OneStringWithMaxLengthOf9Value2.class.getDeclaredField(
                        "oneStringWithMaxLengthOf9").getType());
    }
}
