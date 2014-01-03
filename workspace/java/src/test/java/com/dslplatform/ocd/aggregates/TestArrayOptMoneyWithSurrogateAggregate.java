package com.dslplatform.ocd.aggregates;

import com.dslplatform.client.Bootstrap;
import com.dslplatform.ocd.aggregates.ArrayOptMoneyWithSurrogateInAggregate.ArrayOptMoneyWithSurrogateAggregate;
import com.dslplatform.ocd.aggregates.ArrayOptMoneyWithSurrogateInAggregate.repositories.ArrayOptMoneyWithSurrogateAggregateRepository;
import com.dslplatform.patterns.ServiceLocator;
import java.util.*;
import java.util.concurrent.ExecutionException;
import org.junit.*;
import static org.junit.Assert.*;

public class TestArrayOptMoneyWithSurrogateAggregate {
    private static ServiceLocator locator;

        private static ArrayOptMoneyWithSurrogateAggregateRepository repository;

    @BeforeClass
    public static void setUpClass() throws Exception {
        System.setProperty(org.slf4j.impl.SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "TRACE");
        locator = Bootstrap.init(TestArrayOptMoneyWithSurrogateAggregate.class.getResourceAsStream("dsl-project.ini"));

        repository = locator.resolve(ArrayOptMoneyWithSurrogateAggregateRepository.class);
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
                java.math.BigDecimal[].class,
                ArrayOptMoneyWithSurrogateAggregate.class.getDeclaredField("arrayOptMoney").getGenericType());
    }

    /* Testing the property getter method type via reflection (no instantiation) */
    @Test
    public void testPropertyGetterType() throws NoSuchMethodException {
        assertEquals(
                java.math.BigDecimal[].class,
                ArrayOptMoneyWithSurrogateAggregate.class.getMethod("getArrayOptMoney").getGenericReturnType());
    }

    /* Testing the property setter method type via reflection (no instantiation) */
    @Test
    public void testPropertySetterType() throws NoSuchMethodException {
        assertEquals(
                ArrayOptMoneyWithSurrogateAggregate.class,
                ArrayOptMoneyWithSurrogateAggregate.class.getMethod("setArrayOptMoney", java.math.BigDecimal[].class).getReturnType());
    }

    /* Testing the default property value */
    @Test
    public void testPropertyDefaultValue() {
        assertArrayEquals(
                new java.math.BigDecimal[0],
                new ArrayOptMoneyWithSurrogateAggregate().getArrayOptMoney());
    }

    /* Setting a non-nullable property to null should trigger an exception */
    @Test(expected = IllegalArgumentException.class)
    public void testSetterNullGuard() {
        try {
            new ArrayOptMoneyWithSurrogateAggregate().setArrayOptMoney(null);
        }
        catch (final IllegalArgumentException e) {
            assertEquals(
                    "Property \"arrayOptMoney\" cannot be null!",
                    e.getMessage());
            throw e;
        }
    }

    /* Testing the default property value after persist */
    @Test
    public void testPropertyDefaultValueAfterPersist()
            throws InterruptedException, ExecutionException {
        cleanup();
        final ArrayOptMoneyWithSurrogateAggregate aggregate = new ArrayOptMoneyWithSurrogateAggregate();

        // Will not mutate the original aggregate
        final String uri = repository.insert(aggregate).get();
        final ArrayOptMoneyWithSurrogateAggregate persisted = repository.find(uri).get();

        assertArrayEquals(
                aggregate.getArrayOptMoney(),
                persisted.getArrayOptMoney());
    }
}
