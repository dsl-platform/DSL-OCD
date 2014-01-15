package com.dslplatform.ocd.values.SinglePropertyInValue.BinaryTests;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneSetOfOneBinariesValue2;

public class TestOneSetOfOneBinariesValue2 {

    /* Testing the property field private access via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneSetOfOneBinariesValue2.class.getDeclaredField(
                        "oneSetOfOneBinaries").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                OneSetOfOneBinariesValue2.class.getDeclaredField(
                        "oneSetOfOneBinaries").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<byte[]> oneSetOfOneBinaries = null;
                }.getClass().getDeclaredField("oneSetOfOneBinaries").getGenericType(),
                OneSetOfOneBinariesValue2.class.getDeclaredField("oneSetOfOneBinaries").getGenericType());
    }
}
