package com.dslplatform.ocd.values.SinglePropertyInValue.Long;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneSetOfOneLongsValue1;
import org.scalatest._;

public class TestOneSetOfOneLongsValue1 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneSetOfOneLongsValue1.class.getDeclaredField(
                        "oneSetOfOneLongs").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                OneSetOfOneLongsValue1.class.getDeclaredField(
                        "oneSetOfOneLongs").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<Long> oneSetOfOneLongs = null;
                }.getClass().getDeclaredField("oneSetOfOneLongs").getGenericType(),
                OneSetOfOneLongsValue1.class.getDeclaredField("oneSetOfOneLongs").getGenericType());
    }
}
