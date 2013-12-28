package com.dslplatform.ocd.values;

import com.dslplatform.client.Bootstrap;
import com.dslplatform.ocd.test.TypeTester;
import com.dslplatform.ocd.values.ArrayStringInValue.ArrayStringValue;
import com.dslplatform.patterns.ServiceLocator;
import java.util.*;
import org.junit.*;
import static org.junit.Assert.*;

public class TestArrayStringValue {
    private static ServiceLocator locator;

    @BeforeClass
    public static void setUpClass() throws Exception {
        locator = Bootstrap.init(TestArrayStringValue.class.getResourceAsStream("dsl-project.ini"));
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
        assertTrue(TypeTester.testField(ArrayStringValue.class, "arrayString")
                .resultEquals(String[].class));
    }

    @Test
    public void testGetterType() throws NoSuchMethodException {
        assertTrue(TypeTester.testGetter(ArrayStringValue.class, "getArrayString")
                .resultEquals(String[].class));
    }

    @Test
    public void testSetterType() throws NoSuchMethodException {
        assertTrue(TypeTester.testSetter(ArrayStringValue.class, "setArrayString", String[].class)
                .resultEquals(ArrayStringValue.class));
    }
}