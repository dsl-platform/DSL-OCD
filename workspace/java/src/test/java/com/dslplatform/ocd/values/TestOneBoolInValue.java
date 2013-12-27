package com.dslplatform.ocd.values;

import com.dslplatform.client.Bootstrap;
import com.dslplatform.ocd.test.TypeTester;
import com.dslplatform.ocd.values.OneBoolInValue.OneBoolValue;
import com.dslplatform.patterns.ServiceLocator;
import java.util.Set;
import org.junit.*;
import static org.junit.Assert.*;

public class TestOneBoolInValue {
    private static ServiceLocator locator;

    @BeforeClass
    public static void setUpClass() throws Exception {
        locator = Bootstrap.init(TestOneBoolInValue.class.getResourceAsStream("/dsl-project.ini"));
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

    @Test
    public void testFieldType() throws NoSuchFieldException {
        assertTrue(TypeTester.testField(OneBoolValue.class, "oneBool")
                .resultEquals(boolean.class));
    }

    @Test
    public void testGetterType() throws NoSuchMethodException {
        assertTrue(TypeTester.testGetter(OneBoolValue.class, "getOneBool")
                .resultEquals(boolean.class));
    }

    @Test
    public void testSetterType() throws NoSuchMethodException {
        assertTrue(TypeTester.testSetter(OneBoolValue.class, "setOneBool", boolean.class)
                .resultEquals(OneBoolValue.class));
    }
}