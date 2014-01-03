package com.dslplatform.ocd.aggregates;

import com.dslplatform.client.Bootstrap;
import com.dslplatform.ocd.aggregates.SetTimestampWithSurrogateInAggregate.SetTimestampWithSurrogateAggregate;
import com.dslplatform.ocd.aggregates.SetTimestampWithSurrogateInAggregate.repositories.SetTimestampWithSurrogateAggregateRepository;
import com.dslplatform.patterns.ServiceLocator;
import java.lang.reflect.*;
import java.util.*;
import java.util.concurrent.ExecutionException;
import org.junit.*;
import static org.junit.Assert.*;

public class TestSetTimestampWithSurrogateAggregate {
    private static ServiceLocator locator;

        private static SetTimestampWithSurrogateAggregateRepository repository;

    @BeforeClass
    public static void setUpClass() throws Exception {
        System.setProperty(org.slf4j.impl.SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "TRACE");
        locator = Bootstrap.init(TestSetTimestampWithSurrogateAggregate.class.getResourceAsStream("dsl-project.ini"));

        repository = locator.resolve(SetTimestampWithSurrogateAggregateRepository.class);
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
                    private final Set<org.joda.time.DateTime> etalon = null;
                }.getClass().getDeclaredField("etalon").getGenericType(),
                SetTimestampWithSurrogateAggregate.class.getDeclaredField("setTimestamp").getGenericType());
    }

    /* Testing the property getter method type via reflection (no instantiation) */
    @Test
    public void testPropertyGetterType() throws NoSuchMethodException {
        assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    public Set<org.joda.time.DateTime> getEtalon() { return null; }
                }.getClass().getMethod("getEtalon").getGenericReturnType(),
                SetTimestampWithSurrogateAggregate.class.getMethod("getSetTimestamp").getGenericReturnType());
    }

    /* Testing the property setter method type via reflection (no instantiation) */
    @Test
    public void testPropertySetterType() throws NoSuchMethodException {
        final Method method = SetTimestampWithSurrogateAggregate.class.getMethod("setSetTimestamp", Set.class);

        assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    public SetTimestampWithSurrogateAggregate setEtalon(final Set<org.joda.time.DateTime> etalon) { return null; }
                }.getClass().getMethod("setEtalon", Set.class).getGenericParameterTypes()[0],
                method.getGenericParameterTypes()[0]);

        assertEquals(
                SetTimestampWithSurrogateAggregate.class,
                method.getGenericReturnType());
    }

    /* Testing the default property value */
    @Test
    public void testPropertyDefaultValue() {
        assertEquals(
                new HashSet<org.joda.time.DateTime>(0),
                new SetTimestampWithSurrogateAggregate().getSetTimestamp());
    }

    /* Setting a non-nullable property to null should trigger an exception */
    @Test(expected = IllegalArgumentException.class)
    public void testSetterNullGuard() {
        try {
            new SetTimestampWithSurrogateAggregate().setSetTimestamp(null);
        }
        catch (final IllegalArgumentException e) {
            assertEquals(
                    "Property \"setTimestamp\" cannot be null!",
                    e.getMessage());
            throw e;
        }
    }

    /* Testing the default property value after persist */
    @Test
    public void testPropertyDefaultValueAfterPersist()
            throws InterruptedException, ExecutionException {
        cleanup();
        final SetTimestampWithSurrogateAggregate aggregate = new SetTimestampWithSurrogateAggregate();

        // Will not mutate the original aggregate
        final String uri = repository.insert(aggregate).get();
        final SetTimestampWithSurrogateAggregate persisted = repository.find(uri).get();

        assertEquals(
                aggregate.getSetTimestamp(),
                persisted.getSetTimestamp());
    }
}
