package com.dslplatform.ocd.values.PropertyInValue.BinaryTests;

import com.dslplatform.ocd.values.PropertyInValue.NullableArrayOfOneBinaries_1;

public class TestNullableArrayOfOneBinaries_1 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableArrayOfOneBinaries_1.class.getDeclaredField(
                        "nullableArrayOfOneBinaries").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                byte[][].class,
                NullableArrayOfOneBinaries_1.class.getDeclaredField(
                        "nullableArrayOfOneBinaries").getType());
    }
}
