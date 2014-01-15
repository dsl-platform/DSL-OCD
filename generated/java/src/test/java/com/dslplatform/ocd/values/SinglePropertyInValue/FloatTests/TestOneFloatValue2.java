package com.dslplatform.ocd.values.SinglePropertyInValue.FloatTests;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneFloatValue2;

public class TestOneFloatValue2 {

    /* Testing the property field private access via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneFloatValue2.class.getDeclaredField(
                        "oneFloat").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                float.class,
                OneFloatValue2.class.getDeclaredField(
                        "oneFloat").getType());
    }
}
