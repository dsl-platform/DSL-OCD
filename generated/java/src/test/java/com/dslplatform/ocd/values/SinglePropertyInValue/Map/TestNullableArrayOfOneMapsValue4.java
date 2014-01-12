package com.dslplatform.ocd.values.SinglePropertyInValue.Map;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfOneMapsValue4;
import org.scalatest._;

public class TestNullableArrayOfOneMapsValue4 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableArrayOfOneMapsValue4.class.getDeclaredField(
                        "nullableArrayOfOneMaps").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Map[].class,
                NullableArrayOfOneMapsValue4.class.getDeclaredField(
                        "nullableArrayOfOneMaps").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Map<String, String>[] nullableArrayOfOneMaps = null;
                }.getClass().getDeclaredField("nullableArrayOfOneMaps").getGenericType(),
                NullableArrayOfOneMapsValue4.class.getDeclaredField("nullableArrayOfOneMaps").getGenericType());
    }
}
