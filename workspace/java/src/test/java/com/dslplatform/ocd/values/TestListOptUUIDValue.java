package com.dslplatform.ocd.values;

import com.dslplatform.client.Bootstrap;
import com.dslplatform.ocd.values.ListOptUUIDInValue.ListOptUUIDValue;
import com.dslplatform.patterns.ServiceLocator;
import java.lang.reflect.*;
import java.util.*;
import org.junit.*;
import static org.junit.Assert.*;

public class TestListOptUUIDValue {
    private static ServiceLocator locator;

    @BeforeClass
    public static void setUpClass() throws Exception {
//        locator = Bootstrap.init(TestListOptUUIDValue.class.getResourceAsStream("dsl-project.ini"));
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
                new Object() {
                    @SuppressWarnings("unused")
                    private final List<java.util.UUID> etalon = null;
                }.getClass().getDeclaredField("etalon").getGenericType(),
                ListOptUUIDValue.class.getDeclaredField("listOptUUID").getGenericType());
    }

    @Test
    public void testGetterType() throws NoSuchMethodException {
        assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    public List<java.util.UUID> getEtalon() { return null; }
                }.getClass().getMethod("getEtalon").getGenericReturnType(),
                ListOptUUIDValue.class.getMethod("getListOptUUID").getGenericReturnType());
    }

    @Test
    public void testSetterType() throws NoSuchMethodException {
        final Method method = ListOptUUIDValue.class.getMethod("setListOptUUID", List.class);

        assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    public ListOptUUIDValue setEtalon(final List<java.util.UUID> etalon) { return null; }
                }.getClass().getMethod("setEtalon", List.class).getGenericParameterTypes()[0],
                method.getGenericParameterTypes()[0]);

        assertEquals(
                ListOptUUIDValue.class,
                method.getGenericReturnType());
    }

    @Test
    public void testDefaultPropertyValue() {
        assertEquals(
                new ArrayList<java.util.UUID>(0),
                new ListOptUUIDValue().getListOptUUID());
    }
}