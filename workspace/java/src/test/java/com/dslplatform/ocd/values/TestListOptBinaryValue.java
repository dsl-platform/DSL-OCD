package com.dslplatform.ocd.values;

import com.dslplatform.client.Bootstrap;
import com.dslplatform.ocd.test.TypeTester;
import com.dslplatform.ocd.values.ListOptBinaryInValue.ListOptBinaryValue;
import com.dslplatform.patterns.ServiceLocator;
import java.util.*;
import org.junit.*;
import static org.junit.Assert.*;

public class TestListOptBinaryValue {
    private static ServiceLocator locator;

    @BeforeClass
    public static void setUpClass() throws Exception {
        locator = Bootstrap.init(TestListOptBinaryValue.class.getResourceAsStream("dsl-project.ini"));
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
        assertTrue(TypeTester.testField(ListOptBinaryValue.class, "listOptBinary")
                .resultEquals(List.class, Binary.class));
    }

    @Test
    public void testGetterType() throws NoSuchMethodException {
        assertTrue(TypeTester.testGetter(ListOptBinaryValue.class, "getListOptBinary")
                .resultEquals(List.class, Binary.class));
    }

    @Test
    public void testSetterType() throws NoSuchMethodException {
        assertTrue(TypeTester.testSetter(ListOptBinaryValue.class, "setListOptBinary", List.class, Binary.class)
                .resultEquals(ListOptBinaryValue.class));
    }
}