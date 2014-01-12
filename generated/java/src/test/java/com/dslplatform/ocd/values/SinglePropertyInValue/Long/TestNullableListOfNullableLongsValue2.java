package com.dslplatform.ocd.values.SinglePropertyInValue.Long;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableListOfNullableLongsValue2;
import org.scalatest._;

public class TestNullableListOfNullableLongsValue2 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableListOfNullableLongsValue2.class.getDeclaredField(
                        "nullableListOfNullableLongs").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                NullableListOfNullableLongsValue2.class.getDeclaredField(
                        "nullableListOfNullableLongs").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<Long> nullableListOfNullableLongs = null;
                }.getClass().getDeclaredField("nullableListOfNullableLongs").getGenericType(),
                NullableListOfNullableLongsValue2.class.getDeclaredField("nullableListOfNullableLongs").getGenericType());
    }
}
