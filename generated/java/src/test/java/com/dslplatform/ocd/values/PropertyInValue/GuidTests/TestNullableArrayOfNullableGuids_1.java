package com.dslplatform.ocd.values.PropertyInValue.GuidTests;

import com.dslplatform.ocd.values.PropertyInValue.NullableArrayOfNullableGuids_1;

public class TestNullableArrayOfNullableGuids_1 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableArrayOfNullableGuids_1.class.getDeclaredField(
                        "nullableArrayOfNullableGuids").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.UUID[].class,
                NullableArrayOfNullableGuids_1.class.getDeclaredField(
                        "nullableArrayOfNullableGuids").getType());
    }
}
