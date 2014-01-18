package com.dslplatform.ocd.values.PropertyInValue.GuidTests;

import com.dslplatform.ocd.values.PropertyInValue.NullableArrayOfOneGuids_1;

public class TestNullableArrayOfOneGuids_1 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableArrayOfOneGuids_1.class.getDeclaredField(
                        "nullableArrayOfOneGuids").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.UUID[].class,
                NullableArrayOfOneGuids_1.class.getDeclaredField(
                        "nullableArrayOfOneGuids").getType());
    }
}
