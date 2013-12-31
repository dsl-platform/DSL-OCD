package com.dslplatform.ocd.aggregates;

import com.dslplatform.client.Bootstrap;
import com.dslplatform.ocd.aggregates.ArrayFloatInAggregate.ArrayFloatAggregate;
import com.dslplatform.ocd.aggregates.ArrayFloatInAggregate.repositories.ArrayFloatAggregateRepository;
import com.dslplatform.patterns.ServiceLocator;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.ExecutionException;
import org.junit.*;
import static org.junit.Assert.*;

public class TestArrayFloatAggregate {
    private static ServiceLocator locator;

        private static ArrayFloatAggregateRepository repository;

    @BeforeClass
    public static void setUpClass() throws Exception {
        System.setProperty(org.slf4j.impl.SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "TRACE");
        locator = Bootstrap.init(TestArrayFloatAggregate.class.getResourceAsStream("dsl-project.ini"));

        repository = locator.resolve(ArrayFloatAggregateRepository.class);
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
                float[].class,
                ArrayFloatAggregate.class.getDeclaredField("arrayFloat").getGenericType());
    }

    /* Testing the property getter method type via reflection (no instantiation) */
    @Test
    public void testPropertyGetterType() throws NoSuchMethodException {
        assertEquals(
                float[].class,
                ArrayFloatAggregate.class.getMethod("getArrayFloat").getGenericReturnType());
    }

    /* Testing the property setter method type via reflection (no instantiation) */
    @Test
    public void testPropertySetterType() throws NoSuchMethodException {
        assertEquals(
                ArrayFloatAggregate.class,
                ArrayFloatAggregate.class.getMethod("setArrayFloat", float[].class).getReturnType());
    }

    /* Testing the default property value */
    @Test
    public void testPropertyDefaultValue() {
        assertArrayEquals(
                new float[0],
                new ArrayFloatAggregate().getArrayFloat(),
                0.0f);
    }

    /* Setting a non-nullable property to null should trigger an exception */
    @Test(expected = IllegalArgumentException.class)
    public void testSetterNullGuard() {
        try {
            new ArrayFloatAggregate().setArrayFloat(null);
        }
        catch (final IllegalArgumentException e) {
            assertEquals(
                    "Property \"arrayFloat\" cannot be null!",
                    e.getMessage());
            throw e;
        }
    }

    /* Testing the default property value after persist */
    @Test
    public void testPropertyDefaultValueAfterPersist()
            throws IOException, InterruptedException, ExecutionException {
        final ArrayFloatAggregate aggregate = new ArrayFloatAggregate();

        // Will not mutate the original aggregate
        final String uri = repository.insert(aggregate).get();
        final ArrayFloatAggregate persisted = repository.find(uri).get();

        assertArrayEquals(
                new float[0],
                persisted.getArrayFloat(),
                0.0f);

        assertArrayEquals(
                aggregate.getArrayFloat(),
                persisted.getArrayFloat(),
                0.0f);
    }
}
