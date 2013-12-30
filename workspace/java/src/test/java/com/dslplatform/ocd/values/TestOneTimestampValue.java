package com.dslplatform.ocd.values;

import com.dslplatform.client.Bootstrap;
import com.dslplatform.ocd.values.OneTimestampInValue.OneTimestampValue;
import com.dslplatform.patterns.ServiceLocator;
import org.junit.*;
import static org.junit.Assert.*;

public class TestOneTimestampValue {
    private static ServiceLocator locator;

    @BeforeClass
    public static void setUpClass() throws Exception {
//        locator = Bootstrap.init(TestOneTimestampValue.class.getResourceAsStream("dsl-project.ini"));
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
//        locator.resolve(java.util.concurrent.ExecutorService.class).shutdown();
//        locator = null;
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testFieldType() throws NoSuchFieldException {
        assertEquals(
                org.joda.time.DateTime.class,
                OneTimestampValue.class.getDeclaredField("oneTimestamp").getGenericType());
    }

    @Test
    public void testGetterType() throws NoSuchMethodException {
        assertEquals(
                org.joda.time.DateTime.class,
                OneTimestampValue.class.getMethod("getOneTimestamp").getGenericReturnType());
    }

    @Test
    public void testSetterType() throws NoSuchMethodException {
        assertEquals(
                OneTimestampValue.class,
                OneTimestampValue.class.getMethod("setOneTimestamp", org.joda.time.DateTime.class).getReturnType());
    }

    @Test
    public void testDefaultPropertyValue() {
        AssertExtensions.assertEquals(
                org.joda.time.DateTime.now(),
                new OneTimestampValue().getOneTimestamp(),
                org.joda.time.Duration.standardSeconds(10));
    }
}
