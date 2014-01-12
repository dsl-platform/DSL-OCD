package com.dslplatform.ocd.values.SinglePropertyInValue.Binary;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneListOfNullableBinariesValue2;
import org.scalatest._;

public class TestOneListOfNullableBinariesValue2 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneListOfNullableBinariesValue2.class.getDeclaredField(
                        "oneListOfNullableBinaries").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                OneListOfNullableBinariesValue2.class.getDeclaredField(
                        "oneListOfNullableBinaries").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<byte[]> oneListOfNullableBinaries = null;
                }.getClass().getDeclaredField("oneListOfNullableBinaries").getGenericType(),
                OneListOfNullableBinariesValue2.class.getDeclaredField("oneListOfNullableBinaries").getGenericType());
    }
}
