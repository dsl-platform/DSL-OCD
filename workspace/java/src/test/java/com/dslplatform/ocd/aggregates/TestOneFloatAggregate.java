package com.dslplatform.ocd.aggregates;

import com.dslplatform.client.Bootstrap;
import com.dslplatform.ocd.aggregates.OneFloatInAggregate.OneFloatAggregate;
import com.dslplatform.ocd.aggregates.OneFloatInAggregate.repositories.OneFloatAggregateRepository;
import com.dslplatform.patterns.ServiceLocator;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import org.junit.*;
import static org.junit.Assert.*;

public class TestOneFloatAggregate {
    private static ServiceLocator locator;

        private static OneFloatAggregateRepository repository;

    @BeforeClass
    public static void setUpClass() throws Exception {
        System.setProperty(org.slf4j.impl.SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "TRACE");
        locator = Bootstrap.init(TestOneFloatAggregate.class.getResourceAsStream("dsl-project.ini"));

        repository = locator.resolve(OneFloatAggregateRepository.class);
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        repository = null;
        locator.resolve(java.util.concurrent.ExecutorService.class).shutdown();
        locator = null;
    }

    @Before
    public void setUp() throws Exception {
        if (repository.countAll().get() > 0) {
          repository.delete(repository.findAll().get()).get();

          final long remaining = repository.countAll().get();
          assertEquals(0L, remaining);
        }
    }

    @After
    public void tearDown() throws Exception {
    }

    /* Testing the property field type via reflection (no instantiation) */
    @Test
    public void testPropertyFieldType() throws NoSuchFieldException {
        assertEquals(
                float.class,
                OneFloatAggregate.class.getDeclaredField("oneFloat").getGenericType());
    }

    /* Testing the property getter method type via reflection (no instantiation) */
    @Test
    public void testPropertyGetterType() throws NoSuchMethodException {
        assertEquals(
                float.class,
                OneFloatAggregate.class.getMethod("getOneFloat").getGenericReturnType());
    }

    /* Testing the property setter method type via reflection (no instantiation) */
    @Test
    public void testPropertySetterType() throws NoSuchMethodException {
        assertEquals(
                OneFloatAggregate.class,
                OneFloatAggregate.class.getMethod("setOneFloat", float.class).getReturnType());
    }

    /* Testing the default property value */
    @Test
    public void testPropertyDefaultValue() {
        assertEquals(
                0.0f,
                new OneFloatAggregate().getOneFloat(),
                0.0f);
    }

    /* Testing the default property value after persist */
    @Test
    public void testPropertyDefaultValueAfterPersist()
            throws IOException, InterruptedException, ExecutionException {
        final OneFloatAggregate aggregate = new OneFloatAggregate();

        // Will not mutate the original aggregate
        final String uri = repository.insert(aggregate).get();
        final OneFloatAggregate persisted = repository.find(uri).get();

        assertEquals(
                0.0f,
                persisted.getOneFloat(),
                0.0f);

        assertEquals(
                aggregate.getOneFloat(),
                persisted.getOneFloat(),
                0.0f);
    }
}
