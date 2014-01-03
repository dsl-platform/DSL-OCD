package com.dslplatform.ocd.aggregates;

import com.dslplatform.client.Bootstrap;
import com.dslplatform.ocd.aggregates.OptArrayOptLongWithSurrogateInAggregate.OptArrayOptLongWithSurrogateAggregate;
import com.dslplatform.ocd.aggregates.OptArrayOptLongWithSurrogateInAggregate.repositories.OptArrayOptLongWithSurrogateAggregateRepository;
import com.dslplatform.patterns.ServiceLocator;
import java.util.*;
import java.util.concurrent.ExecutionException;
import org.junit.*;
import static org.junit.Assert.*;

public class TestOptArrayOptLongWithSurrogateAggregate {
    private static ServiceLocator locator;

        private static OptArrayOptLongWithSurrogateAggregateRepository repository;

    @BeforeClass
    public static void setUpClass() throws Exception {
        System.setProperty(org.slf4j.impl.SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "TRACE");
        locator = Bootstrap.init(TestOptArrayOptLongWithSurrogateAggregate.class.getResourceAsStream("dsl-project.ini"));

        repository = locator.resolve(OptArrayOptLongWithSurrogateAggregateRepository.class);
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
                Long[].class,
                OptArrayOptLongWithSurrogateAggregate.class.getDeclaredField("optArrayOptLong").getGenericType());
    }

    /* Testing the property getter method type via reflection (no instantiation) */
    @Test
    public void testPropertyGetterType() throws NoSuchMethodException {
        assertEquals(
                Long[].class,
                OptArrayOptLongWithSurrogateAggregate.class.getMethod("getOptArrayOptLong").getGenericReturnType());
    }

    /* Testing the property setter method type via reflection (no instantiation) */
    @Test
    public void testPropertySetterType() throws NoSuchMethodException {
        assertEquals(
                OptArrayOptLongWithSurrogateAggregate.class,
                OptArrayOptLongWithSurrogateAggregate.class.getMethod("setOptArrayOptLong", Long[].class).getReturnType());
    }

    /* Testing the default property value */
    @Test
    public void testPropertyDefaultValue() {
        assertNull(new OptArrayOptLongWithSurrogateAggregate().getOptArrayOptLong());
    }

    /* Setting a nullable property to null should not trigger an exception */
    @Test
    public void testLackOfSetterNullGuard() {
        final OptArrayOptLongWithSurrogateAggregate value = new OptArrayOptLongWithSurrogateAggregate();
        assertSame(value.setOptArrayOptLong(null), value);
    }

    /* Testing the default property value after persist */
    @Test
    public void testPropertyDefaultValueAfterPersist()
            throws InterruptedException, ExecutionException {
        cleanup();
        final OptArrayOptLongWithSurrogateAggregate aggregate = new OptArrayOptLongWithSurrogateAggregate();

        // Will not mutate the original aggregate
        final String uri = repository.insert(aggregate).get();
        final OptArrayOptLongWithSurrogateAggregate persisted = repository.find(uri).get();

        assertEquals(
                aggregate.getOptArrayOptLong(),
                persisted.getOptArrayOptLong());
    }
}
