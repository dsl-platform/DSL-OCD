package com.dslplatform.ocd.values;

import com.dslplatform.client.Bootstrap;
import com.dslplatform.ocd.test.TypeTester;
import com.dslplatform.ocd.values.OptSetOptBoolInValue.OptSetOptBoolValue;
import com.dslplatform.patterns.ServiceLocator;
import java.util.Set;
import org.junit.*;
import static org.junit.Assert.*;

public class Test1388182863852 {
    private static ServiceLocator locator;

    @BeforeClass
    public static void setUpClass() throws Exception {
        locator = Bootstrap.init(Test1388182863852.class.getResourceAsStream("/dsl-project.ini"));
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
        assertTrue(TypeTester.testField(OptSetOptBoolValue.class, "optSetOptBool")
                .resultEquals(boolean.class));
    }

    @Test
    public void testGetterType() throws NoSuchMethodException {
        assertTrue(TypeTester.testGetter(OptSetOptBoolValue.class, "getOptSetOptBool")
                .resultEquals(boolean.class));
    }

    @Test
    public void testSetterType() throws NoSuchMethodException {
        assertTrue(TypeTester.testSetter(OptSetOptBoolValue.class, "setOptSetOptBool", boolean.class)
                .resultEquals(OptSetOptBoolValue.class));
    }
}