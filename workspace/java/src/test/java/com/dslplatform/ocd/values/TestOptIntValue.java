package com.dslplatform.ocd.values;

import com.dslplatform.client.Bootstrap;
import com.dslplatform.ocd.values.OptIntInValue.OptIntValue;
import com.dslplatform.patterns.ServiceLocator;
import org.junit.*;
import static org.junit.Assert.*;

public class TestOptIntValue {
    private static ServiceLocator locator;

    @BeforeClass
    public static void setUpClass() throws Exception {
//        locator = Bootstrap.init(TestOptIntValue.class.getResourceAsStream("dsl-project.ini"));
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
                Integer.class,
                OptIntValue.class.getDeclaredField("optInt").getGenericType());
    }

    @Test
    public void testGetterType() throws NoSuchMethodException {
        assertEquals(
                Integer.class,
                OptIntValue.class.getMethod("getOptInt").getGenericReturnType());
    }

    @Test
    public void testSetterType() throws NoSuchMethodException {
        assertEquals(
                OptIntValue.class,
                OptIntValue.class.getMethod("setOptInt", Integer.class).getReturnType());
    }

    @Test
    public void testDefaultPropertyValue() {
        assertNull(new OptIntValue().getOptInt());
    }
}