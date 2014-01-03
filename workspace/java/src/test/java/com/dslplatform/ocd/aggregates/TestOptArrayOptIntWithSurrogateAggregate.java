package com.dslplatform.ocd.aggregates;

import com.dslplatform.client.Bootstrap;
import com.dslplatform.ocd.aggregates.OptArrayOptIntWithSurrogateInAggregate.OptArrayOptIntWithSurrogateAggregate;
import com.dslplatform.ocd.aggregates.OptArrayOptIntWithSurrogateInAggregate.repositories.OptArrayOptIntWithSurrogateAggregateRepository;
import com.dslplatform.patterns.ServiceLocator;
import java.util.*;
import java.util.concurrent.ExecutionException;
import org.junit.*;
import static org.junit.Assert.*;

public class TestOptArrayOptIntWithSurrogateAggregate {
    private static ServiceLocator locator;

        private static OptArrayOptIntWithSurrogateAggregateRepository repository;

    @BeforeClass
    public static void setUpClass() throws Exception {
        System.setProperty(org.slf4j.impl.SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "TRACE");
        locator = Bootstrap.init(TestOptArrayOptIntWithSurrogateAggregate.class.getResourceAsStream("dsl-project.ini"));

        repository = locator.resolve(OptArrayOptIntWithSurrogateAggregateRepository.class);
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
                Integer[].class,
                OptArrayOptIntWithSurrogateAggregate.class.getDeclaredField("optArrayOptInt").getGenericType());
    }

    /* Testing the property getter method type via reflection (no instantiation) */
    @Test
    public void testPropertyGetterType() throws NoSuchMethodException {
        assertEquals(
                Integer[].class,
                OptArrayOptIntWithSurrogateAggregate.class.getMethod("getOptArrayOptInt").getGenericReturnType());
    }

    /* Testing the property setter method type via reflection (no instantiation) */
    @Test
    public void testPropertySetterType() throws NoSuchMethodException {
        assertEquals(
                OptArrayOptIntWithSurrogateAggregate.class,
                OptArrayOptIntWithSurrogateAggregate.class.getMethod("setOptArrayOptInt", Integer[].class).getReturnType());
    }

    /* Testing the default property value */
    @Test
    public void testPropertyDefaultValue() {
        assertNull(new OptArrayOptIntWithSurrogateAggregate().getOptArrayOptInt());
    }

    /* Setting a nullable property to null should not trigger an exception */
    @Test
    public void testLackOfSetterNullGuard() {
        final OptArrayOptIntWithSurrogateAggregate value = new OptArrayOptIntWithSurrogateAggregate();
        assertSame(value.setOptArrayOptInt(null), value);
    }

    /* Testing the default property value after persist */
    @Test
    public void testPropertyDefaultValueAfterPersist()
            throws InterruptedException, ExecutionException {
        cleanup();
        final OptArrayOptIntWithSurrogateAggregate aggregate = new OptArrayOptIntWithSurrogateAggregate();

        // Will not mutate the original aggregate
        final String uri = repository.insert(aggregate).get();
        final OptArrayOptIntWithSurrogateAggregate persisted = repository.find(uri).get();

        assertEquals(
                aggregate.getOptArrayOptInt(),
                persisted.getOptArrayOptInt());
    }
}
