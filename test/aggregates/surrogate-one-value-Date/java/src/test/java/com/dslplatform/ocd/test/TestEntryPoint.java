package com.dslplatform.ocd.test;

import junit.framework.JUnit4TestAdapter;
import junit.framework.TestSuite;
import org.junit.runner.RunWith;
import org.junit.runners.AllTests;

@RunWith(AllTests.class)
public class TestEntryPoint {

    private static final Class<?>[] TEST_CLASSES = {
        com.dslplatform.ocd.aggregates.AggregateTypeWithSurrogateKeyAndNullableArrayOfNullableDatesPropertyTest.class,
        com.dslplatform.ocd.aggregates.AggregateTypeWithSurrogateKeyAndNullableArrayOfOneDatesPropertyTest.class,
        com.dslplatform.ocd.aggregates.AggregateTypeWithSurrogateKeyAndNullableDatePropertyTest.class,
        com.dslplatform.ocd.aggregates.AggregateTypeWithSurrogateKeyAndNullableListOfNullableDatesPropertyTest.class,
        com.dslplatform.ocd.aggregates.AggregateTypeWithSurrogateKeyAndNullableListOfOneDatesPropertyTest.class,
        com.dslplatform.ocd.aggregates.AggregateTypeWithSurrogateKeyAndNullableSetOfNullableDatesPropertyTest.class,
        com.dslplatform.ocd.aggregates.AggregateTypeWithSurrogateKeyAndNullableSetOfOneDatesPropertyTest.class,
        com.dslplatform.ocd.aggregates.AggregateTypeWithSurrogateKeyAndOneArrayOfNullableDatesPropertyTest.class,
        com.dslplatform.ocd.aggregates.AggregateTypeWithSurrogateKeyAndOneArrayOfOneDatesPropertyTest.class,
        com.dslplatform.ocd.aggregates.AggregateTypeWithSurrogateKeyAndOneDatePropertyTest.class,
        com.dslplatform.ocd.aggregates.AggregateTypeWithSurrogateKeyAndOneListOfNullableDatesPropertyTest.class,
        com.dslplatform.ocd.aggregates.AggregateTypeWithSurrogateKeyAndOneListOfOneDatesPropertyTest.class,
        com.dslplatform.ocd.aggregates.AggregateTypeWithSurrogateKeyAndOneSetOfNullableDatesPropertyTest.class,
        com.dslplatform.ocd.aggregates.AggregateTypeWithSurrogateKeyAndOneSetOfOneDatesPropertyTest.class
    };

    public static TestSuite suite() {
        final TestSuite suite = new TestSuite();
        for (final Class<?> clazz : TEST_CLASSES) {
            suite.addTest(new JUnit4TestAdapter(clazz));
        }
        return suite;
     }
}
