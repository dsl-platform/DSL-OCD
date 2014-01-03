package com.dslplatform.ocd.aggregates;

import com.dslplatform.client.Bootstrap;
import com.dslplatform.ocd.aggregates.ListOptBoolWithSurrogateInAggregate.ListOptBoolWithSurrogateAggregate;
import com.dslplatform.ocd.aggregates.ListOptBoolWithSurrogateInAggregate.repositories.ListOptBoolWithSurrogateAggregateRepository;
import com.dslplatform.patterns.ServiceLocator;
import java.lang.reflect.*;
import java.util.*;
import java.util.concurrent.ExecutionException;
import org.junit.*;
import static org.junit.Assert.*;

public class TestListOptBoolWithSurrogateAggregate {
    private static ServiceLocator locator;

        private static ListOptBoolWithSurrogateAggregateRepository repository;

    @BeforeClass
    public static void setUpClass() throws Exception {
        System.setProperty(org.slf4j.impl.SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "TRACE");
        locator = Bootstrap.init(TestListOptBoolWithSurrogateAggregate.class.getResourceAsStream("dsl-project.ini"));

        repository = locator.resolve(ListOptBoolWithSurrogateAggregateRepository.class);
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
                ListOptBoolWithSurrogateAggregate.class.getDeclaredField("listOptBool").getGenericType());
    }

    /* Testing the property getter method type via reflection (no instantiation) */
    @Test
    public void testPropertyGetterType() throws NoSuchMethodException {
        assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    public List<Boolean> getEtalon() { return null; }
                }.getClass().getMethod("getEtalon").getGenericReturnType(),
                ListOptBoolWithSurrogateAggregate.class.getMethod("getListOptBool").getGenericReturnType());
    }

    /* Testing the property setter method type via reflection (no instantiation) */
    @Test
    public void testPropertySetterType() throws NoSuchMethodException {
        final Method method = ListOptBoolWithSurrogateAggregate.class.getMethod("setListOptBool", List.class);

        assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    public ListOptBoolWithSurrogateAggregate setEtalon(final List<Boolean> etalon) { return null; }
                }.getClass().getMethod("setEtalon", List.class).getGenericParameterTypes()[0],
                method.getGenericParameterTypes()[0]);

        assertEquals(
                ListOptBoolWithSurrogateAggregate.class,
                method.getGenericReturnType());
    }

    /* Testing the default property value */
    @Test
    public void testPropertyDefaultValue() {
        assertEquals(
                new ArrayList<Boolean>(0),
                new ListOptBoolWithSurrogateAggregate().getListOptBool());
    }

    /* Setting a non-nullable property to null should trigger an exception */
    @Test(expected = IllegalArgumentException.class)
    public void testSetterNullGuard() {
        try {
            new ListOptBoolWithSurrogateAggregate().setListOptBool(null);
        }
        catch (final IllegalArgumentException e) {
            assertEquals(
                    "Property \"listOptBool\" cannot be null!",
                    e.getMessage());
            throw e;
        }
    }

    /* Testing the default property value after persist */
    @Test
    public void testPropertyDefaultValueAfterPersist()
            throws InterruptedException, ExecutionException {
        cleanup();
        final ListOptBoolWithSurrogateAggregate aggregate = new ListOptBoolWithSurrogateAggregate();

        // Will not mutate the original aggregate
        final String uri = repository.insert(aggregate).get();
        final ListOptBoolWithSurrogateAggregate persisted = repository.find(uri).get();

        assertEquals(
                aggregate.getListOptBool(),
                persisted.getListOptBool());
    }
}
