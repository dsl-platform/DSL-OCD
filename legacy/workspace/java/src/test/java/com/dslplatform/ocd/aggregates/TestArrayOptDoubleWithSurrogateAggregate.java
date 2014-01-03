package com.dslplatform.ocd.aggregates;

import com.dslplatform.client.Bootstrap;
import com.dslplatform.ocd.aggregates.ArrayOptDoubleWithSurrogateInAggregate.ArrayOptDoubleWithSurrogateAggregate;
import com.dslplatform.ocd.aggregates.ArrayOptDoubleWithSurrogateInAggregate.repositories.ArrayOptDoubleWithSurrogateAggregateRepository;
import com.dslplatform.patterns.ServiceLocator;
import java.util.*;
import java.util.concurrent.ExecutionException;
import org.junit.*;
import static org.junit.Assert.*;

public class TestArrayOptDoubleWithSurrogateAggregate {
    private static ServiceLocator locator;

        private static ArrayOptDoubleWithSurrogateAggregateRepository repository;

    @BeforeClass
    public static void setUpClass() throws Exception {
        System.setProperty(org.slf4j.impl.SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "TRACE");
        locator = Bootstrap.init(TestArrayOptDoubleWithSurrogateAggregate.class.getResourceAsStream("dsl-project.ini"));

        repository = locator.resolve(ArrayOptDoubleWithSurrogateAggregateRepository.class);
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
                Double[].class,
                ArrayOptDoubleWithSurrogateAggregate.class.getDeclaredField("arrayOptDouble").getGenericType());
    }

    /* Testing the property getter method type via reflection (no instantiation) */
    @Test
    public void testPropertyGetterType() throws NoSuchMethodException {
        assertEquals(
                Double[].class,
                ArrayOptDoubleWithSurrogateAggregate.class.getMethod("getArrayOptDouble").getGenericReturnType());
    }

    /* Testing the property setter method type via reflection (no instantiation) */
    @Test
    public void testPropertySetterType() throws NoSuchMethodException {
        assertEquals(
                ArrayOptDoubleWithSurrogateAggregate.class,
                ArrayOptDoubleWithSurrogateAggregate.class.getMethod("setArrayOptDouble", Double[].class).getReturnType());
    }

    /* Testing the default property value */
    @Test
    public void testPropertyDefaultValue() {
        AssertExtensions.assertArrayEquals(
                new Double[0],
                new ArrayOptDoubleWithSurrogateAggregate().getArrayOptDouble(),
                0.0);
    }

    /* Setting a non-nullable property to null should trigger an exception */
    @Test(expected = IllegalArgumentException.class)
    public void testSetterNullGuard() {
        try {
            new ArrayOptDoubleWithSurrogateAggregate().setArrayOptDouble(null);
        }
        catch (final IllegalArgumentException e) {
            assertEquals(
                    "Property \"arrayOptDouble\" cannot be null!",
                    e.getMessage());
            throw e;
        }
    }

    /* Testing the default property value after persist */
    @Test
    public void testPropertyDefaultValueAfterPersist()
            throws InterruptedException, ExecutionException {
        cleanup();
        final ArrayOptDoubleWithSurrogateAggregate aggregate = new ArrayOptDoubleWithSurrogateAggregate();

        // Will not mutate the original aggregate
        final String uri = repository.insert(aggregate).get();
        final ArrayOptDoubleWithSurrogateAggregate persisted = repository.find(uri).get();

        AssertExtensions.assertArrayEquals(
                aggregate.getArrayOptDouble(),
                persisted.getArrayOptDouble(),
                0.0);
    }
}
