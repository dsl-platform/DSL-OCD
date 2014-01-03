package com.dslplatform.ocd.aggregates;

import com.dslplatform.client.Bootstrap;
import com.dslplatform.ocd.aggregates.OneFloatWithSurrogateInAggregate.OneFloatWithSurrogateAggregate;
import com.dslplatform.ocd.aggregates.OneFloatWithSurrogateInAggregate.repositories.OneFloatWithSurrogateAggregateRepository;
import com.dslplatform.patterns.ServiceLocator;
import java.util.concurrent.ExecutionException;
import org.junit.*;
import static org.junit.Assert.*;

public class TestOneFloatWithSurrogateAggregate {
    private static ServiceLocator locator;

        private static OneFloatWithSurrogateAggregateRepository repository;

    @BeforeClass
    public static void setUpClass() throws Exception {
        System.setProperty(org.slf4j.impl.SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "TRACE");
        locator = Bootstrap.init(TestOneFloatWithSurrogateAggregate.class.getResourceAsStream("dsl-project.ini"));

        repository = locator.resolve(OneFloatWithSurrogateAggregateRepository.class);
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
                float.class,
                OneFloatWithSurrogateAggregate.class.getDeclaredField("oneFloat").getGenericType());
    }

    /* Testing the property getter method type via reflection (no instantiation) */
    @Test
    public void testPropertyGetterType() throws NoSuchMethodException {
        assertEquals(
                float.class,
                OneFloatWithSurrogateAggregate.class.getMethod("getOneFloat").getGenericReturnType());
    }

    /* Testing the property setter method type via reflection (no instantiation) */
    @Test
    public void testPropertySetterType() throws NoSuchMethodException {
        assertEquals(
                OneFloatWithSurrogateAggregate.class,
                OneFloatWithSurrogateAggregate.class.getMethod("setOneFloat", float.class).getReturnType());
    }

    /* Testing the default property value */
    @Test
    public void testPropertyDefaultValue() {
        assertEquals(
                0.0f,
                new OneFloatWithSurrogateAggregate().getOneFloat(),
                0.0f);
    }

    /* Testing the default property value after persist */
    @Test
    public void testPropertyDefaultValueAfterPersist()
            throws InterruptedException, ExecutionException {
        cleanup();
        final OneFloatWithSurrogateAggregate aggregate = new OneFloatWithSurrogateAggregate();

        // Will not mutate the original aggregate
        final String uri = repository.insert(aggregate).get();
        final OneFloatWithSurrogateAggregate persisted = repository.find(uri).get();

        assertEquals(
                aggregate.getOneFloat(),
                persisted.getOneFloat(),
                0.0f);
    }
}
