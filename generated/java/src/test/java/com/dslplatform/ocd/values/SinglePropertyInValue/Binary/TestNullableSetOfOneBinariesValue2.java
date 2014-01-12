package com.dslplatform.ocd.values.SinglePropertyInValue.Binary;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfOneBinariesValue2;
import org.scalatest._;

public class TestNullableSetOfOneBinariesValue2 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableSetOfOneBinariesValue2.class.getDeclaredField(
                        "nullableSetOfOneBinaries").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                NullableSetOfOneBinariesValue2.class.getDeclaredField(
                        "nullableSetOfOneBinaries").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<byte[]> nullableSetOfOneBinaries = null;
                }.getClass().getDeclaredField("nullableSetOfOneBinaries").getGenericType(),
                NullableSetOfOneBinariesValue2.class.getDeclaredField("nullableSetOfOneBinaries").getGenericType());
    }
}
