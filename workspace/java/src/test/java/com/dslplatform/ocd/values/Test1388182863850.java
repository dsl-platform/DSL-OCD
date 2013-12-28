package com.dslplatform.ocd.values;

import com.dslplatform.client.Bootstrap;
import com.dslplatform.ocd.test.TypeTester;
import com.dslplatform.ocd.values.OptBoolInValue.OptBoolValue;
import com.dslplatform.patterns.ServiceLocator;
import java.util.Set;
import org.junit.*;
import static org.junit.Assert.*;

public class Test1388182863850 {
    private static ServiceLocator locator;

    @BeforeClass
    public static void setUpClass() throws Exception {
        locator = Bootstrap.init(Test1388182863850.class.getResourceAsStream("/dsl-project.ini"));
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
        assertTrue(TypeTester.testField(OptBoolValue.class, "optBool")
                .resultEquals(boolean.class));
    }

    @Test
    public void testGetterType() throws NoSuchMethodException {
        assertTrue(TypeTester.testGetter(OptBoolValue.class, "getOptBool")
                .resultEquals(boolean.class));
    }

    @Test
    public void testSetterType() throws NoSuchMethodException {
        assertTrue(TypeTester.testSetter(OptBoolValue.class, "setOptBool", boolean.class)
                .resultEquals(OptBoolValue.class));
    }
}