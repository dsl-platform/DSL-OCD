package com.dslplatform.ocd.values;

import com.dslplatform.client.Bootstrap;
import com.dslplatform.ocd.test.TypeTester;
import com.dslplatform.ocd.values.OptListLongInValue.OptListLongValue;
import com.dslplatform.patterns.ServiceLocator;
import java.util.*;
import org.junit.*;
import static org.junit.Assert.*;

public class TestOptListLongValue {
    private static ServiceLocator locator;

    @BeforeClass
    public static void setUpClass() throws Exception {
        locator = Bootstrap.init(TestOptListLongValue.class.getResourceAsStream("dsl-project.ini"));
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
        assertTrue(TypeTester.testField(OptListLongValue.class, "optListLong")
                .resultEquals(List.class, Long.class));
    }

    @Test
    public void testGetterType() throws NoSuchMethodException {
        assertTrue(TypeTester.testGetter(OptListLongValue.class, "getOptListLong")
                .resultEquals(List.class, Long.class));
    }

    @Test
    public void testSetterType() throws NoSuchMethodException {
        assertTrue(TypeTester.testSetter(OptListLongValue.class, "setOptListLong", List.class, Long.class)
                .resultEquals(OptListLongValue.class));
    }
}