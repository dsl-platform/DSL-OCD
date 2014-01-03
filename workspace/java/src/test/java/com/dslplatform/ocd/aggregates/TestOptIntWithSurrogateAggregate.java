package com.dslplatform.ocd.aggregates;

import com.dslplatform.client.Bootstrap;
import com.dslplatform.ocd.aggregates.OptIntWithSurrogateInAggregate.OptIntWithSurrogateAggregate;
import com.dslplatform.ocd.aggregates.OptIntWithSurrogateInAggregate.repositories.OptIntWithSurrogateAggregateRepository;
import com.dslplatform.patterns.ServiceLocator;
import java.util.*;
import java.util.concurrent.ExecutionException;
import org.junit.*;
import static org.junit.Assert.*;

public class TestOptIntWithSurrogateAggregate {
    private static ServiceLocator locator;

        private static OptIntWithSurrogateAggregateRepository repository;

    @BeforeClass
    public static void setUpClass() throws Exception {
        System.setProperty(org.slf4j.impl.SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "TRACE");
        locator = Bootstrap.init(TestOptIntWithSurrogateAggregate.class.getResourceAsStream("dsl-project.ini"));

        repository = locator.resolve(OptIntWithSurrogateAggregateRepository.class);
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
                Integer.class,
                OptIntWithSurrogateAggregate.class.getDeclaredField("optInt").getGenericType());
    }

    /* Testing the property getter method type via reflection (no instantiation) */
    @Test
    public void testPropertyGetterType() throws NoSuchMethodException {
        assertEquals(
                Integer.class,
                OptIntWithSurrogateAggregate.class.getMethod("getOptInt").getGenericReturnType());
    }

    /* Testing the property setter method type via reflection (no instantiation) */
    @Test
    public void testPropertySetterType() throws NoSuchMethodException {
        assertEquals(
                OptIntWithSurrogateAggregate.class,
                OptIntWithSurrogateAggregate.class.getMethod("setOptInt", Integer.class).getReturnType());
    }

    /* Testing the default property value */
    @Test
    public void testPropertyDefaultValue() {
        assertNull(new OptIntWithSurrogateAggregate().getOptInt());
    }

    /* Setting a nullable property to null should not trigger an exception */
    @Test
    public void testLackOfSetterNullGuard() {
        final OptIntWithSurrogateAggregate value = new OptIntWithSurrogateAggregate();
        assertSame(value.setOptInt(null), value);
    }

    /* Testing the default property value after persist */
    @Test
    public void testPropertyDefaultValueAfterPersist()
            throws InterruptedException, ExecutionException {
        cleanup();
        final OptIntWithSurrogateAggregate aggregate = new OptIntWithSurrogateAggregate();

        // Will not mutate the original aggregate
        final String uri = repository.insert(aggregate).get();
        final OptIntWithSurrogateAggregate persisted = repository.find(uri).get();

        assertEquals(
                aggregate.getOptInt(),
                persisted.getOptInt());
    }
}
