package com.dslplatform.ocd.aggregates;

import com.dslplatform.client.Bootstrap;
import com.dslplatform.ocd.aggregates.OneTimestampInAggregate.OneTimestampAggregate;
import com.dslplatform.ocd.aggregates.OneTimestampInAggregate.repositories.OneTimestampAggregateRepository;
import com.dslplatform.patterns.ServiceLocator;
import java.util.*;
import java.util.concurrent.ExecutionException;
import org.junit.*;
import static org.junit.Assert.*;

public class TestOneTimestampAggregate {
    private static ServiceLocator locator;

        private static OneTimestampAggregateRepository repository;

    @BeforeClass
    public static void setUpClass() throws Exception {
        System.setProperty(org.slf4j.impl.SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "TRACE");
        locator = Bootstrap.init(TestOneTimestampAggregate.class.getResourceAsStream("dsl-project.ini"));

        repository = locator.resolve(OneTimestampAggregateRepository.class);
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
                org.joda.time.DateTime.class,
                OneTimestampAggregate.class.getDeclaredField("oneTimestamp").getGenericType());
    }

    /* Testing the property getter method type via reflection (no instantiation) */
    @Test
    public void testPropertyGetterType() throws NoSuchMethodException {
        assertEquals(
                org.joda.time.DateTime.class,
                OneTimestampAggregate.class.getMethod("getOneTimestamp").getGenericReturnType());
    }

    /* Testing the property setter method type via reflection (no instantiation) */
    @Test
    public void testPropertySetterType() throws NoSuchMethodException {
        assertEquals(
                OneTimestampAggregate.class,
                OneTimestampAggregate.class.getMethod("setOneTimestamp", org.joda.time.DateTime.class).getReturnType());
    }

    /* Testing the default property value */
    @Test
    public void testPropertyDefaultValue() {
        AssertExtensions.assertEquals(
                org.joda.time.DateTime.now(),
                new OneTimestampAggregate().getOneTimestamp(),
                org.joda.time.Duration.standardSeconds(10));
    }

    /* Setting a non-nullable property to null should trigger an exception */
    @Test(expected = IllegalArgumentException.class)
    public void testSetterNullGuard() {
        try {
            new OneTimestampAggregate().setOneTimestamp(null);
        }
        catch (final IllegalArgumentException e) {
            assertEquals(
                    "Property \"oneTimestamp\" cannot be null!",
                    e.getMessage());
            throw e;
        }
    }

    /* Testing the default property value after persist */
    @Test
    public void testPropertyDefaultValueAfterPersist()
            throws InterruptedException, ExecutionException {
        cleanup();
        final OneTimestampAggregate aggregate = new OneTimestampAggregate();

        // Will not mutate the original aggregate
        final String uri = repository.insert(aggregate).get();
        final OneTimestampAggregate persisted = repository.find(uri).get();

        AssertExtensions.assertEquals(
                aggregate.getOneTimestamp(),
                persisted.getOneTimestamp(),
                org.joda.time.Duration.standardSeconds(0));
    }
}