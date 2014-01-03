package com.dslplatform.ocd.aggregates;

import com.dslplatform.client.Bootstrap;
import com.dslplatform.ocd.aggregates.OneXMLWithSurrogateInAggregate.OneXMLWithSurrogateAggregate;
import com.dslplatform.ocd.aggregates.OneXMLWithSurrogateInAggregate.repositories.OneXMLWithSurrogateAggregateRepository;
import com.dslplatform.patterns.ServiceLocator;
import java.util.*;
import java.util.concurrent.ExecutionException;
import org.junit.*;
import static org.junit.Assert.*;

public class TestOneXMLWithSurrogateAggregate {
    private static ServiceLocator locator;

        private static OneXMLWithSurrogateAggregateRepository repository;

    @BeforeClass
    public static void setUpClass() throws Exception {
        System.setProperty(org.slf4j.impl.SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "TRACE");
        locator = Bootstrap.init(TestOneXMLWithSurrogateAggregate.class.getResourceAsStream("dsl-project.ini"));

        repository = locator.resolve(OneXMLWithSurrogateAggregateRepository.class);
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
                org.w3c.dom.Element.class,
                OneXMLWithSurrogateAggregate.class.getDeclaredField("oneXML").getGenericType());
    }

    /* Testing the property getter method type via reflection (no instantiation) */
    @Test
    public void testPropertyGetterType() throws NoSuchMethodException {
        assertEquals(
                org.w3c.dom.Element.class,
                OneXMLWithSurrogateAggregate.class.getMethod("getOneXML").getGenericReturnType());
    }

    /* Testing the property setter method type via reflection (no instantiation) */
    @Test
    public void testPropertySetterType() throws NoSuchMethodException {
        assertEquals(
                OneXMLWithSurrogateAggregate.class,
                OneXMLWithSurrogateAggregate.class.getMethod("setOneXML", org.w3c.dom.Element.class).getReturnType());
    }

    /* Testing the default property value */
    @Test
    public void testPropertyDefaultValue() {
        assertNull(new OneXMLWithSurrogateAggregate().getOneXML());
    }

    /* Setting a non-nullable property to null should trigger an exception */
    @Test(expected = IllegalArgumentException.class)
    public void testSetterNullGuard() {
        try {
            new OneXMLWithSurrogateAggregate().setOneXML(null);
        }
        catch (final IllegalArgumentException e) {
            assertEquals(
                    "Property \"oneXML\" cannot be null!",
                    e.getMessage());
            throw e;
        }
    }

    /* Testing the default property value after persist */
    @Test
    public void testPropertyDefaultValueAfterPersist()
            throws InterruptedException, ExecutionException {
        cleanup();
        final OneXMLWithSurrogateAggregate aggregate = new OneXMLWithSurrogateAggregate();

        // Will not mutate the original aggregate
        final String uri = repository.insert(aggregate).get();
        final OneXMLWithSurrogateAggregate persisted = repository.find(uri).get();

        assertEquals(
                aggregate.getOneXML(),
                persisted.getOneXML());
    }
}
