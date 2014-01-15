package com.dslplatform.ocd.values.SinglePropertyInValue.GuidTests;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableGuidValue6;

public class TestNullableGuidValue6 {

    /* Testing the property field private access via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableGuidValue6.class.getDeclaredField(
                        "nullableGuid").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.UUID.class,
                NullableGuidValue6.class.getDeclaredField(
                        "nullableGuid").getType());
    }
}
