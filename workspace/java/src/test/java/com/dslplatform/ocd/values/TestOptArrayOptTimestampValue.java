package com.dslplatform.ocd.values;

import com.dslplatform.client.Bootstrap;
import com.dslplatform.ocd.values.OptArrayOptTimestampInValue.OptArrayOptTimestampValue;
import com.dslplatform.patterns.ServiceLocator;
import org.junit.*;
import static org.junit.Assert.*;

public class TestOptArrayOptTimestampValue {
    private static ServiceLocator locator;

    @BeforeClass
    public static void setUpClass() throws Exception {
//        locator = Bootstrap.init(TestOptArrayOptTimestampValue.class.getResourceAsStream("dsl-project.ini"));
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
                org.joda.time.DateTime[].class,
                OptArrayOptTimestampValue.class.getDeclaredField("optArrayOptTimestamp").getGenericType());
    }

    @Test
    public void testGetterType() throws NoSuchMethodException {
        assertEquals(
                org.joda.time.DateTime[].class,
                OptArrayOptTimestampValue.class.getMethod("getOptArrayOptTimestamp").getGenericReturnType());
    }

    @Test
    public void testSetterType() throws NoSuchMethodException {
        assertEquals(
                OptArrayOptTimestampValue.class,
                OptArrayOptTimestampValue.class.getMethod("setOptArrayOptTimestamp", org.joda.time.DateTime[].class).getReturnType());
    }

    @Test
    public void testDefaultPropertyValue() {
        assertNull(new OptArrayOptTimestampValue().getOptArrayOptTimestamp());
    }
}
