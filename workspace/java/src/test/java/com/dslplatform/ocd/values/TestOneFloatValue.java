package com.dslplatform.ocd.values;

import com.dslplatform.client.Bootstrap;
import com.dslplatform.ocd.values.OneFloatInValue.OneFloatValue;
import com.dslplatform.patterns.ServiceLocator;
import org.junit.*;
import static org.junit.Assert.*;

public class TestOneFloatValue {
    private static ServiceLocator locator;

    @BeforeClass
    public static void setUpClass() throws Exception {
//        locator = Bootstrap.init(TestOneFloatValue.class.getResourceAsStream("dsl-project.ini"));
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
                float.class,
                OneFloatValue.class.getDeclaredField("oneFloat").getGenericType());
    }

    @Test
    public void testGetterType() throws NoSuchMethodException {
        assertEquals(
                float.class,
                OneFloatValue.class.getMethod("getOneFloat").getGenericReturnType());
    }

    @Test
    public void testSetterType() throws NoSuchMethodException {
        assertEquals(
                OneFloatValue.class,
                OneFloatValue.class.getMethod("setOneFloat", float.class).getReturnType());
    }

    @Test
    public void testDefaultPropertyValue() {
        assertEquals(
                0.0f,
                new OneFloatValue().getOneFloat(),
                0.0f);
    }
}
