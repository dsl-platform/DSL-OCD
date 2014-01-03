package com.dslplatform.ocd.values;

import com.dslplatform.client.Bootstrap;
import com.dslplatform.ocd.values.OneTimestampInValue.OneTimestampValue;
import com.dslplatform.patterns.ServiceLocator;
import java.util.*;
import org.junit.*;
import static org.junit.Assert.*;

public class TestOneTimestampValue {
    private static ServiceLocator locator;

    @BeforeClass
    public static void setUpClass() throws Exception {
        System.setProperty(org.slf4j.impl.SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "TRACE");
        locator = Bootstrap.init(TestOneTimestampValue.class.getResourceAsStream("dsl-project.ini"));
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        locator.resolve(java.util.concurrent.ExecutorService.class).shutdown();
        locator = null;
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    /* Testing the property field type via reflection (no instantiation) */
    @Test
    public void testPropertyFieldType() throws NoSuchFieldException {
        assertEquals(
                org.joda.time.DateTime.class,
                OneTimestampValue.class.getDeclaredField("oneTimestamp").getGenericType());
    }

    /* Testing the property getter method type via reflection (no instantiation) */
    @Test
    public void testPropertyGetterType() throws NoSuchMethodException {
        assertEquals(
                org.joda.time.DateTime.class,
                OneTimestampValue.class.getMethod("getOneTimestamp").getGenericReturnType());
    }

    /* Testing the property setter method type via reflection (no instantiation) */
    @Test
    public void testPropertySetterType() throws NoSuchMethodException {
        assertEquals(
                OneTimestampValue.class,
                OneTimestampValue.class.getMethod("setOneTimestamp", org.joda.time.DateTime.class).getReturnType());
    }

    /* Testing the default property value */
    @Test
    public void testPropertyDefaultValue() {
        AssertExtensions.assertEquals(
                org.joda.time.DateTime.now(),
                new OneTimestampValue().getOneTimestamp(),
                org.joda.time.Duration.standardSeconds(10));
    }

    /* Setting a non-nullable property to null should trigger an exception */
    @Test(expected = IllegalArgumentException.class)
    public void testSetterNullGuard() {
        try {
            new OneTimestampValue().setOneTimestamp(null);
        }
        catch (final IllegalArgumentException e) {
            assertEquals(
                    "Property \"oneTimestamp\" cannot be null!",
                    e.getMessage());
            throw e;
        }
    }
}
