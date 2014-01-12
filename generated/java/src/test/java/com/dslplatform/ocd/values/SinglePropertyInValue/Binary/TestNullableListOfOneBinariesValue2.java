package com.dslplatform.ocd.values.SinglePropertyInValue.Binary;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableListOfOneBinariesValue2;
import org.scalatest._;

public class TestNullableListOfOneBinariesValue2 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableListOfOneBinariesValue2.class.getDeclaredField(
                        "nullableListOfOneBinaries").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                NullableListOfOneBinariesValue2.class.getDeclaredField(
                        "nullableListOfOneBinaries").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<byte[]> nullableListOfOneBinaries = null;
                }.getClass().getDeclaredField("nullableListOfOneBinaries").getGenericType(),
                NullableListOfOneBinariesValue2.class.getDeclaredField("nullableListOfOneBinaries").getGenericType());
    }
}
