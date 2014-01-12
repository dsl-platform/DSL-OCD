package com.dslplatform.ocd.values.SinglePropertyInValue.Long;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableListOfOneLongsValue3;
import org.scalatest._;

public class TestNullableListOfOneLongsValue3 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableListOfOneLongsValue3.class.getDeclaredField(
                        "nullableListOfOneLongs").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                NullableListOfOneLongsValue3.class.getDeclaredField(
                        "nullableListOfOneLongs").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<Long> nullableListOfOneLongs = null;
                }.getClass().getDeclaredField("nullableListOfOneLongs").getGenericType(),
                NullableListOfOneLongsValue3.class.getDeclaredField("nullableListOfOneLongs").getGenericType());
    }
}
