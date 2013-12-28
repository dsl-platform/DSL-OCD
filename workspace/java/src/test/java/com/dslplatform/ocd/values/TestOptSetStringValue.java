package com.dslplatform.ocd.values;

import com.dslplatform.client.Bootstrap;
import com.dslplatform.ocd.test.TypeTester;
import com.dslplatform.ocd.values.OptSetStringInValue.OptSetStringValue;
import com.dslplatform.patterns.ServiceLocator;
import java.util.*;
import org.junit.*;
import static org.junit.Assert.*;

public class TestOptSetStringValue {
    private static ServiceLocator locator;

    @BeforeClass
    public static void setUpClass() throws Exception {
        locator = Bootstrap.init(TestOptSetStringValue.class.getResourceAsStream("dsl-project.ini"));
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
        assertTrue(TypeTester.testField(OptSetStringValue.class, "optSetString")
                .resultEquals(Set.class, String.class));
    }

    @Test
    public void testGetterType() throws NoSuchMethodException {
        assertTrue(TypeTester.testGetter(OptSetStringValue.class, "getOptSetString")
                .resultEquals(Set.class, String.class));
    }

    @Test
    public void testSetterType() throws NoSuchMethodException {
        assertTrue(TypeTester.testSetter(OptSetStringValue.class, "setOptSetString", Set.class, String.class)
                .resultEquals(OptSetStringValue.class));
    }
}