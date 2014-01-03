package com.dslplatform.ocd.aggregates;

import com.dslplatform.client.Bootstrap;
import com.dslplatform.ocd.aggregates.OneDoubleInAggregate.OneDoubleAggregate;
import com.dslplatform.ocd.aggregates.OneDoubleInAggregate.repositories.OneDoubleAggregateRepository;
import com.dslplatform.patterns.ServiceLocator;
import java.util.concurrent.ExecutionException;
import org.junit.*;
import static org.junit.Assert.*;

public class TestOneDoubleAggregate {
    private static ServiceLocator locator;

        private static OneDoubleAggregateRepository repository;

    @BeforeClass
    public static void setUpClass() throws Exception {
        System.setProperty(org.slf4j.impl.SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "TRACE");
        locator = Bootstrap.init(TestOneDoubleAggregate.class.getResourceAsStream("dsl-project.ini"));

        repository = locator.resolve(OneDoubleAggregateRepository.class);
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
                double.class,
                OneDoubleAggregate.class.getDeclaredField("oneDouble").getGenericType());
    }

    /* Testing the property getter method type via reflection (no instantiation) */
    @Test
    public void testPropertyGetterType() throws NoSuchMethodException {
        assertEquals(
                double.class,
                OneDoubleAggregate.class.getMethod("getOneDouble").getGenericReturnType());
    }

    /* Testing the property setter method type via reflection (no instantiation) */
    @Test
    public void testPropertySetterType() throws NoSuchMethodException {
        assertEquals(
                OneDoubleAggregate.class,
                OneDoubleAggregate.class.getMethod("setOneDouble", double.class).getReturnType());
    }

    /* Testing the default property value */
    @Test
    public void testPropertyDefaultValue() {
        assertEquals(
                0.0,
                new OneDoubleAggregate().getOneDouble(),
                0.0);
    }

    /* Testing the default property value after persist */
    @Test
    public void testPropertyDefaultValueAfterPersist()
            throws InterruptedException, ExecutionException {
        cleanup();
        final OneDoubleAggregate aggregate = new OneDoubleAggregate();

        // Will not mutate the original aggregate
        final String uri = repository.insert(aggregate).get();
        final OneDoubleAggregate persisted = repository.find(uri).get();

        assertEquals(
                aggregate.getOneDouble(),
                persisted.getOneDouble(),
                0.0);
    }
}
