package com.dslplatform.ocd.aggregates;

import com.dslplatform.client.Bootstrap;
import com.dslplatform.ocd.aggregates.ListBoolInAggregate.ListBoolAggregate;
import com.dslplatform.ocd.aggregates.ListBoolInAggregate.repositories.ListBoolAggregateRepository;
import com.dslplatform.patterns.ServiceLocator;
import java.lang.reflect.*;
import java.util.*;
import java.util.concurrent.ExecutionException;
import org.junit.*;
import static org.junit.Assert.*;

public class TestListBoolAggregate {
    private static ServiceLocator locator;

        private static ListBoolAggregateRepository repository;

    @BeforeClass
    public static void setUpClass() throws Exception {
        System.setProperty(org.slf4j.impl.SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "TRACE");
        locator = Bootstrap.init(TestListBoolAggregate.class.getResourceAsStream("dsl-project.ini"));

        repository = locator.resolve(ListBoolAggregateRepository.class);
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        repository = null;
        locator.resolve(java.util.concurrent.ExecutorService.class).shutdown();
        locator = null;
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    private static void cleanup()
            throws InterruptedException, ExecutionException {
        if (repository.countAll().get() > 0) {
            repository.delete(repository.findAll().get()).get();

            final long remaining = repository.countAll().get();
            assertEquals(0L, remaining);
        }
    }

    /* Testing the property field type via reflection (no instantiation) */
    @Test
    public void testPropertyFieldType() throws NoSuchFieldException {
        assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final List<Boolean> etalon = null;
                }.getClass().getDeclaredField("etalon").getGenericType(),
                ListBoolAggregate.class.getDeclaredField("listBool").getGenericType());
    }

    /* Testing the property getter method type via reflection (no instantiation) */
    @Test
    public void testPropertyGetterType() throws NoSuchMethodException {
        assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    public List<Boolean> getEtalon() { return null; }
                }.getClass().getMethod("getEtalon").getGenericReturnType(),
                ListBoolAggregate.class.getMethod("getListBool").getGenericReturnType());
    }

    /* Testing the property setter method type via reflection (no instantiation) */
    @Test
    public void testPropertySetterType() throws NoSuchMethodException {
        final Method method = ListBoolAggregate.class.getMethod("setListBool", List.class);

        assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    public ListBoolAggregate setEtalon(final List<Boolean> etalon) { return null; }
                }.getClass().getMethod("setEtalon", List.class).getGenericParameterTypes()[0],
                method.getGenericParameterTypes()[0]);

        assertEquals(
                ListBoolAggregate.class,
                method.getGenericReturnType());
    }

    /* Testing the default property value */
    @Test
    public void testPropertyDefaultValue() {
        assertEquals(
                new ArrayList<Boolean>(0),
                new ListBoolAggregate().getListBool());
    }

    /* Setting a non-nullable property to null should trigger an exception */
    @Test(expected = IllegalArgumentException.class)
    public void testSetterNullGuard() {
        try {
            new ListBoolAggregate().setListBool(null);
        }
        catch (final IllegalArgumentException e) {
            assertEquals(
                    "Property \"listBool\" cannot be null!",
                    e.getMessage());
            throw e;
        }
    }

    /* Testing the default property value after persist */
    @Test
    public void testPropertyDefaultValueAfterPersist()
            throws InterruptedException, ExecutionException {
        cleanup();
        final ListBoolAggregate aggregate = new ListBoolAggregate();

        // Will not mutate the original aggregate
        final String uri = repository.insert(aggregate).get();
        final ListBoolAggregate persisted = repository.find(uri).get();

        assertEquals(
                aggregate.getListBool(),
                persisted.getListBool());
    }
}
