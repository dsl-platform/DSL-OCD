package com.dslplatform.ocd.aggregates;

import com.dslplatform.client.Bootstrap;
import com.dslplatform.ocd.aggregates.ArrayStringInAggregate.ArrayStringAggregate;
import com.dslplatform.ocd.aggregates.ArrayStringInAggregate.repositories.ArrayStringAggregateRepository;
import com.dslplatform.patterns.ServiceLocator;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.ExecutionException;
import org.junit.*;
import static org.junit.Assert.*;

public class TestArrayStringAggregate {
    private static ServiceLocator locator;

        private static ArrayStringAggregateRepository repository;

    @BeforeClass
    public static void setUpClass() throws Exception {
        System.setProperty(org.slf4j.impl.SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "TRACE");
        locator = Bootstrap.init(TestArrayStringAggregate.class.getResourceAsStream("dsl-project.ini"));

        repository = locator.resolve(ArrayStringAggregateRepository.class);
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
                String[].class,
                ArrayStringAggregate.class.getDeclaredField("arrayString").getGenericType());
    }

    /* Testing the property getter method type via reflection (no instantiation) */
    @Test
    public void testPropertyGetterType() throws NoSuchMethodException {
        assertEquals(
                String[].class,
                ArrayStringAggregate.class.getMethod("getArrayString").getGenericReturnType());
    }

    /* Testing the property setter method type via reflection (no instantiation) */
    @Test
    public void testPropertySetterType() throws NoSuchMethodException {
        assertEquals(
                ArrayStringAggregate.class,
                ArrayStringAggregate.class.getMethod("setArrayString", String[].class).getReturnType());
    }

    /* Testing the default property value */
    @Test
    public void testPropertyDefaultValue() {
        assertArrayEquals(
                new String[0],
                new ArrayStringAggregate().getArrayString());
    }

    /* Setting a non-nullable property to null should trigger an exception */
    @Test(expected = IllegalArgumentException.class)
    public void testSetterNullGuard() {
        try {
            new ArrayStringAggregate().setArrayString(null);
        }
        catch (final IllegalArgumentException e) {
            assertEquals(
                    "Property \"arrayString\" cannot be null!",
                    e.getMessage());
            throw e;
        }
    }

    /* Testing the default property value after persist */
    @Test
    public void testPropertyDefaultValueAfterPersist()
            throws IOException, InterruptedException, ExecutionException {
        final ArrayStringAggregate aggregate = new ArrayStringAggregate();

        // Will not mutate the original aggregate
        final String uri = repository.insert(aggregate).get();
        final ArrayStringAggregate persisted = repository.find(uri).get();

        assertArrayEquals(
                new String[0],
                persisted.getArrayString());

        assertArrayEquals(
                aggregate.getArrayString(),
                persisted.getArrayString());
    }
}
