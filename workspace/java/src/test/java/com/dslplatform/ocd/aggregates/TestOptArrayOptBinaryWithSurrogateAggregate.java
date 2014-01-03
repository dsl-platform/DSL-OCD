package com.dslplatform.ocd.aggregates;

import com.dslplatform.client.Bootstrap;
import com.dslplatform.ocd.aggregates.OptArrayOptBinaryWithSurrogateInAggregate.OptArrayOptBinaryWithSurrogateAggregate;
import com.dslplatform.ocd.aggregates.OptArrayOptBinaryWithSurrogateInAggregate.repositories.OptArrayOptBinaryWithSurrogateAggregateRepository;
import com.dslplatform.patterns.ServiceLocator;
import java.util.*;
import java.util.concurrent.ExecutionException;
import org.junit.*;
import static org.junit.Assert.*;

public class TestOptArrayOptBinaryWithSurrogateAggregate {
    private static ServiceLocator locator;

        private static OptArrayOptBinaryWithSurrogateAggregateRepository repository;

    @BeforeClass
    public static void setUpClass() throws Exception {
        System.setProperty(org.slf4j.impl.SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "TRACE");
        locator = Bootstrap.init(TestOptArrayOptBinaryWithSurrogateAggregate.class.getResourceAsStream("dsl-project.ini"));

        repository = locator.resolve(OptArrayOptBinaryWithSurrogateAggregateRepository.class);
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
                byte[][].class,
                OptArrayOptBinaryWithSurrogateAggregate.class.getDeclaredField("optArrayOptBinary").getGenericType());
    }

    /* Testing the property getter method type via reflection (no instantiation) */
    @Test
    public void testPropertyGetterType() throws NoSuchMethodException {
        assertEquals(
                byte[][].class,
                OptArrayOptBinaryWithSurrogateAggregate.class.getMethod("getOptArrayOptBinary").getGenericReturnType());
    }

    /* Testing the property setter method type via reflection (no instantiation) */
    @Test
    public void testPropertySetterType() throws NoSuchMethodException {
        assertEquals(
                OptArrayOptBinaryWithSurrogateAggregate.class,
                OptArrayOptBinaryWithSurrogateAggregate.class.getMethod("setOptArrayOptBinary", byte[][].class).getReturnType());
    }

    /* Testing the default property value */
    @Test
    public void testPropertyDefaultValue() {
        assertNull(new OptArrayOptBinaryWithSurrogateAggregate().getOptArrayOptBinary());
    }

    /* Setting a nullable property to null should not trigger an exception */
    @Test
    public void testLackOfSetterNullGuard() {
        final OptArrayOptBinaryWithSurrogateAggregate value = new OptArrayOptBinaryWithSurrogateAggregate();
        assertSame(value.setOptArrayOptBinary(null), value);
    }

    /* Testing the default property value after persist */
    @Test
    public void testPropertyDefaultValueAfterPersist()
            throws InterruptedException, ExecutionException {
        cleanup();
        final OptArrayOptBinaryWithSurrogateAggregate aggregate = new OptArrayOptBinaryWithSurrogateAggregate();

        // Will not mutate the original aggregate
        final String uri = repository.insert(aggregate).get();
        final OptArrayOptBinaryWithSurrogateAggregate persisted = repository.find(uri).get();

        assertEquals(
                aggregate.getOptArrayOptBinary(),
                persisted.getOptArrayOptBinary());
    }
}
