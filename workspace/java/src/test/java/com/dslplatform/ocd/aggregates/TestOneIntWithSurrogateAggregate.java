package com.dslplatform.ocd.aggregates;

import com.dslplatform.client.Bootstrap;
import com.dslplatform.ocd.aggregates.OneIntWithSurrogateInAggregate.OneIntWithSurrogateAggregate;
import com.dslplatform.ocd.aggregates.OneIntWithSurrogateInAggregate.repositories.OneIntWithSurrogateAggregateRepository;
import com.dslplatform.patterns.ServiceLocator;
import java.util.concurrent.ExecutionException;
import org.junit.*;
import static org.junit.Assert.*;

public class TestOneIntWithSurrogateAggregate {
    private static ServiceLocator locator;

        private static OneIntWithSurrogateAggregateRepository repository;

    @BeforeClass
    public static void setUpClass() throws Exception {
        System.setProperty(org.slf4j.impl.SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "TRACE");
        locator = Bootstrap.init(TestOneIntWithSurrogateAggregate.class.getResourceAsStream("dsl-project.ini"));

        repository = locator.resolve(OneIntWithSurrogateAggregateRepository.class);
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
                int.class,
                OneIntWithSurrogateAggregate.class.getDeclaredField("oneInt").getGenericType());
    }

    /* Testing the property getter method type via reflection (no instantiation) */
    @Test
    public void testPropertyGetterType() throws NoSuchMethodException {
        assertEquals(
                int.class,
                OneIntWithSurrogateAggregate.class.getMethod("getOneInt").getGenericReturnType());
    }

    /* Testing the property setter method type via reflection (no instantiation) */
    @Test
    public void testPropertySetterType() throws NoSuchMethodException {
        assertEquals(
                OneIntWithSurrogateAggregate.class,
                OneIntWithSurrogateAggregate.class.getMethod("setOneInt", int.class).getReturnType());
    }

    /* Testing the default property value */
    @Test
    public void testPropertyDefaultValue() {
        assertEquals(
                0,
                new OneIntWithSurrogateAggregate().getOneInt());
    }

    /* Testing the default property value after persist */
    @Test
    public void testPropertyDefaultValueAfterPersist()
            throws InterruptedException, ExecutionException {
        cleanup();
        final OneIntWithSurrogateAggregate aggregate = new OneIntWithSurrogateAggregate();

        // Will not mutate the original aggregate
        final String uri = repository.insert(aggregate).get();
        final OneIntWithSurrogateAggregate persisted = repository.find(uri).get();

        assertEquals(
                aggregate.getOneInt(),
                persisted.getOneInt());
    }
}
