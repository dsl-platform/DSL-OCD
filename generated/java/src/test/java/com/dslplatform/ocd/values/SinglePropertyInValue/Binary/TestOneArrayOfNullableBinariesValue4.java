package com.dslplatform.ocd.values.SinglePropertyInValue.Binary;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfNullableBinariesValue4;
import org.scalatest._;

public class TestOneArrayOfNullableBinariesValue4 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfNullableBinariesValue4.class.getDeclaredField(
                        "oneArrayOfNullableBinaries").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                byte[][].class,
                OneArrayOfNullableBinariesValue4.class.getDeclaredField(
                        "oneArrayOfNullableBinaries").getType());
    }
}
