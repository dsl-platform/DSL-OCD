package com.dslplatform.ocd.aggregates;

import com.dslplatform.client.Bootstrap;
import com.dslplatform.ocd.aggregates.ListOptTimestampWithSurrogateInAggregate.ListOptTimestampWithSurrogateAggregate;
import com.dslplatform.ocd.aggregates.ListOptTimestampWithSurrogateInAggregate.repositories.ListOptTimestampWithSurrogateAggregateRepository;
import com.dslplatform.patterns.ServiceLocator;
import java.lang.reflect.*;
import java.util.*;
import java.util.concurrent.ExecutionException;
import org.junit.*;
import static org.junit.Assert.*;

public class TestListOptTimestampWithSurrogateAggregate {
    private static ServiceLocator locator;

        private static ListOptTimestampWithSurrogateAggregateRepository repository;

    @BeforeClass
    public static void setUpClass() throws Exception {
        System.setProperty(org.slf4j.impl.SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "TRACE");
        locator = Bootstrap.init(TestListOptTimestampWithSurrogateAggregate.class.getResourceAsStream("dsl-project.ini"));

        repository = locator.resolve(ListOptTimestampWithSurrogateAggregateRepository.class);
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
                    private final List<org.joda.time.DateTime> etalon = null;
                }.getClass().getDeclaredField("etalon").getGenericType(),
                ListOptTimestampWithSurrogateAggregate.class.getDeclaredField("listOptTimestamp").getGenericType());
    }

    /* Testing the property getter method type via reflection (no instantiation) */
    @Test
    public void testPropertyGetterType() throws NoSuchMethodException {
        assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    public List<org.joda.time.DateTime> getEtalon() { return null; }
                }.getClass().getMethod("getEtalon").getGenericReturnType(),
                ListOptTimestampWithSurrogateAggregate.class.getMethod("getListOptTimestamp").getGenericReturnType());
    }

    /* Testing the property setter method type via reflection (no instantiation) */
    @Test
    public void testPropertySetterType() throws NoSuchMethodException {
        final Method method = ListOptTimestampWithSurrogateAggregate.class.getMethod("setListOptTimestamp", List.class);

        assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    public ListOptTimestampWithSurrogateAggregate setEtalon(final List<org.joda.time.DateTime> etalon) { return null; }
                }.getClass().getMethod("setEtalon", List.class).getGenericParameterTypes()[0],
                method.getGenericParameterTypes()[0]);

        assertEquals(
                ListOptTimestampWithSurrogateAggregate.class,
                method.getGenericReturnType());
    }

    /* Testing the default property value */
    @Test
    public void testPropertyDefaultValue() {
        assertEquals(
                new ArrayList<org.joda.time.DateTime>(0),
                new ListOptTimestampWithSurrogateAggregate().getListOptTimestamp());
    }

    /* Setting a non-nullable property to null should trigger an exception */
    @Test(expected = IllegalArgumentException.class)
    public void testSetterNullGuard() {
        try {
            new ListOptTimestampWithSurrogateAggregate().setListOptTimestamp(null);
        }
        catch (final IllegalArgumentException e) {
            assertEquals(
                    "Property \"listOptTimestamp\" cannot be null!",
                    e.getMessage());
            throw e;
        }
    }

    /* Testing the default property value after persist */
    @Test
    public void testPropertyDefaultValueAfterPersist()
            throws InterruptedException, ExecutionException {
        cleanup();
        final ListOptTimestampWithSurrogateAggregate aggregate = new ListOptTimestampWithSurrogateAggregate();

        // Will not mutate the original aggregate
        final String uri = repository.insert(aggregate).get();
        final ListOptTimestampWithSurrogateAggregate persisted = repository.find(uri).get();

        assertEquals(
                aggregate.getListOptTimestamp(),
                persisted.getListOptTimestamp());
    }
}
