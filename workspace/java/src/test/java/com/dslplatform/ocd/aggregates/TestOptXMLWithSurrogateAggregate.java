package com.dslplatform.ocd.aggregates;

import com.dslplatform.client.Bootstrap;
import com.dslplatform.ocd.aggregates.OptXMLWithSurrogateInAggregate.OptXMLWithSurrogateAggregate;
import com.dslplatform.ocd.aggregates.OptXMLWithSurrogateInAggregate.repositories.OptXMLWithSurrogateAggregateRepository;
import com.dslplatform.patterns.ServiceLocator;
import java.util.*;
import java.util.concurrent.ExecutionException;
import org.junit.*;
import static org.junit.Assert.*;

public class TestOptXMLWithSurrogateAggregate {
    private static ServiceLocator locator;

        private static OptXMLWithSurrogateAggregateRepository repository;

    @BeforeClass
    public static void setUpClass() throws Exception {
        System.setProperty(org.slf4j.impl.SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "TRACE");
        locator = Bootstrap.init(TestOptXMLWithSurrogateAggregate.class.getResourceAsStream("dsl-project.ini"));

        repository = locator.resolve(OptXMLWithSurrogateAggregateRepository.class);
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
                OptXMLWithSurrogateAggregate.class.getDeclaredField("optXML").getGenericType());
    }

    /* Testing the property getter method type via reflection (no instantiation) */
    @Test
    public void testPropertyGetterType() throws NoSuchMethodException {
        assertEquals(
                org.w3c.dom.Element.class,
                OptXMLWithSurrogateAggregate.class.getMethod("getOptXML").getGenericReturnType());
    }

    /* Testing the property setter method type via reflection (no instantiation) */
    @Test
    public void testPropertySetterType() throws NoSuchMethodException {
        assertEquals(
                OptXMLWithSurrogateAggregate.class,
                OptXMLWithSurrogateAggregate.class.getMethod("setOptXML", org.w3c.dom.Element.class).getReturnType());
    }

    /* Testing the default property value */
    @Test
    public void testPropertyDefaultValue() {
        assertNull(new OptXMLWithSurrogateAggregate().getOptXML());
    }

    /* Setting a nullable property to null should not trigger an exception */
    @Test
    public void testLackOfSetterNullGuard() {
        final OptXMLWithSurrogateAggregate value = new OptXMLWithSurrogateAggregate();
        assertSame(value.setOptXML(null), value);
    }

    /* Testing the default property value after persist */
    @Test
    public void testPropertyDefaultValueAfterPersist()
            throws InterruptedException, ExecutionException {
        cleanup();
        final OptXMLWithSurrogateAggregate aggregate = new OptXMLWithSurrogateAggregate();

        // Will not mutate the original aggregate
        final String uri = repository.insert(aggregate).get();
        final OptXMLWithSurrogateAggregate persisted = repository.find(uri).get();

        assertEquals(
                aggregate.getOptXML(),
                persisted.getOptXML());
    }
}
