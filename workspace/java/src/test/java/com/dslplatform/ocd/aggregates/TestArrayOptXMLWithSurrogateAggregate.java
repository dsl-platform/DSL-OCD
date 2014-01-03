package com.dslplatform.ocd.aggregates;

import com.dslplatform.client.Bootstrap;
import com.dslplatform.ocd.aggregates.ArrayOptXMLWithSurrogateInAggregate.ArrayOptXMLWithSurrogateAggregate;
import com.dslplatform.ocd.aggregates.ArrayOptXMLWithSurrogateInAggregate.repositories.ArrayOptXMLWithSurrogateAggregateRepository;
import com.dslplatform.patterns.ServiceLocator;
import java.util.*;
import java.util.concurrent.ExecutionException;
import org.junit.*;
import static org.junit.Assert.*;

public class TestArrayOptXMLWithSurrogateAggregate {
    private static ServiceLocator locator;

        private static ArrayOptXMLWithSurrogateAggregateRepository repository;

    @BeforeClass
    public static void setUpClass() throws Exception {
        System.setProperty(org.slf4j.impl.SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "TRACE");
        locator = Bootstrap.init(TestArrayOptXMLWithSurrogateAggregate.class.getResourceAsStream("dsl-project.ini"));

        repository = locator.resolve(ArrayOptXMLWithSurrogateAggregateRepository.class);
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
                org.w3c.dom.Element[].class,
                ArrayOptXMLWithSurrogateAggregate.class.getDeclaredField("arrayOptXML").getGenericType());
    }

    /* Testing the property getter method type via reflection (no instantiation) */
    @Test
    public void testPropertyGetterType() throws NoSuchMethodException {
        assertEquals(
                org.w3c.dom.Element[].class,
                ArrayOptXMLWithSurrogateAggregate.class.getMethod("getArrayOptXML").getGenericReturnType());
    }

    /* Testing the property setter method type via reflection (no instantiation) */
    @Test
    public void testPropertySetterType() throws NoSuchMethodException {
        assertEquals(
                ArrayOptXMLWithSurrogateAggregate.class,
                ArrayOptXMLWithSurrogateAggregate.class.getMethod("setArrayOptXML", org.w3c.dom.Element[].class).getReturnType());
    }

    /* Testing the default property value */
    @Test
    public void testPropertyDefaultValue() {
        assertArrayEquals(
                new org.w3c.dom.Element[0],
                new ArrayOptXMLWithSurrogateAggregate().getArrayOptXML());
    }

    /* Setting a non-nullable property to null should trigger an exception */
    @Test(expected = IllegalArgumentException.class)
    public void testSetterNullGuard() {
        try {
            new ArrayOptXMLWithSurrogateAggregate().setArrayOptXML(null);
        }
        catch (final IllegalArgumentException e) {
            assertEquals(
                    "Property \"arrayOptXML\" cannot be null!",
                    e.getMessage());
            throw e;
        }
    }

    /* Testing the default property value after persist */
    @Test
    public void testPropertyDefaultValueAfterPersist()
            throws InterruptedException, ExecutionException {
        cleanup();
        final ArrayOptXMLWithSurrogateAggregate aggregate = new ArrayOptXMLWithSurrogateAggregate();

        // Will not mutate the original aggregate
        final String uri = repository.insert(aggregate).get();
        final ArrayOptXMLWithSurrogateAggregate persisted = repository.find(uri).get();

        assertArrayEquals(
                aggregate.getArrayOptXML(),
                persisted.getArrayOptXML());
    }
}
