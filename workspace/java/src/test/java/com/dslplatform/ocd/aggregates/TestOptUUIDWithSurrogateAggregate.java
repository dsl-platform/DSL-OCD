package com.dslplatform.ocd.aggregates;

import com.dslplatform.client.Bootstrap;
import com.dslplatform.ocd.aggregates.OptUUIDWithSurrogateInAggregate.OptUUIDWithSurrogateAggregate;
import com.dslplatform.ocd.aggregates.OptUUIDWithSurrogateInAggregate.repositories.OptUUIDWithSurrogateAggregateRepository;
import com.dslplatform.patterns.ServiceLocator;
import java.util.*;
import java.util.concurrent.ExecutionException;
import org.junit.*;
import static org.junit.Assert.*;

public class TestOptUUIDWithSurrogateAggregate {
    private static ServiceLocator locator;

        private static OptUUIDWithSurrogateAggregateRepository repository;

    @BeforeClass
    public static void setUpClass() throws Exception {
        System.setProperty(org.slf4j.impl.SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "TRACE");
        locator = Bootstrap.init(TestOptUUIDWithSurrogateAggregate.class.getResourceAsStream("dsl-project.ini"));

        repository = locator.resolve(OptUUIDWithSurrogateAggregateRepository.class);
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
                java.util.UUID.class,
                OptUUIDWithSurrogateAggregate.class.getDeclaredField("optUUID").getGenericType());
    }

    /* Testing the property getter method type via reflection (no instantiation) */
    @Test
    public void testPropertyGetterType() throws NoSuchMethodException {
        assertEquals(
                java.util.UUID.class,
                OptUUIDWithSurrogateAggregate.class.getMethod("getOptUUID").getGenericReturnType());
    }

    /* Testing the property setter method type via reflection (no instantiation) */
    @Test
    public void testPropertySetterType() throws NoSuchMethodException {
        assertEquals(
                OptUUIDWithSurrogateAggregate.class,
                OptUUIDWithSurrogateAggregate.class.getMethod("setOptUUID", java.util.UUID.class).getReturnType());
    }

    /* Testing the default property value */
    @Test
    public void testPropertyDefaultValue() {
        assertNull(new OptUUIDWithSurrogateAggregate().getOptUUID());
    }

    /* Setting a nullable property to null should not trigger an exception */
    @Test
    public void testLackOfSetterNullGuard() {
        final OptUUIDWithSurrogateAggregate value = new OptUUIDWithSurrogateAggregate();
        assertSame(value.setOptUUID(null), value);
    }

    /* Testing the default property value after persist */
    @Test
    public void testPropertyDefaultValueAfterPersist()
            throws InterruptedException, ExecutionException {
        cleanup();
        final OptUUIDWithSurrogateAggregate aggregate = new OptUUIDWithSurrogateAggregate();

        // Will not mutate the original aggregate
        final String uri = repository.insert(aggregate).get();
        final OptUUIDWithSurrogateAggregate persisted = repository.find(uri).get();

        assertEquals(
                aggregate.getOptUUID(),
                persisted.getOptUUID());
    }
}
