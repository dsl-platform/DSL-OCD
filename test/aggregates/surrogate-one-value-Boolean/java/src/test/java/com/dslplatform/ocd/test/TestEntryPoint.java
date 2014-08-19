package com.dslplatform.ocd.test;

import junit.framework.JUnit4TestAdapter;
import junit.framework.TestSuite;
import org.junit.runner.RunWith;
import org.junit.runners.AllTests;

@RunWith(AllTests.class)
public class TestEntryPoint {

    private static final Class<?>[] TEST_CLASSES = {
        com.dslplatform.ocd.aggregates.AggregateTypeWithSurrogateKeyAndNullableArrayOfNullableBooleansPropertyTest.class,
        com.dslplatform.ocd.aggregates.AggregateTypeWithSurrogateKeyAndNullableArrayOfOneBooleansPropertyTest.class,
        com.dslplatform.ocd.aggregates.AggregateTypeWithSurrogateKeyAndNullableBooleanPropertyTest.class,
        com.dslplatform.ocd.aggregates.AggregateTypeWithSurrogateKeyAndNullableListOfNullableBooleansPropertyTest.class,
        com.dslplatform.ocd.aggregates.AggregateTypeWithSurrogateKeyAndNullableListOfOneBooleansPropertyTest.class,
        com.dslplatform.ocd.aggregates.AggregateTypeWithSurrogateKeyAndNullableSetOfNullableBooleansPropertyTest.class,
        com.dslplatform.ocd.aggregates.AggregateTypeWithSurrogateKeyAndNullableSetOfOneBooleansPropertyTest.class,
        com.dslplatform.ocd.aggregates.AggregateTypeWithSurrogateKeyAndOneArrayOfNullableBooleansPropertyTest.class,
        com.dslplatform.ocd.aggregates.AggregateTypeWithSurrogateKeyAndOneArrayOfOneBooleansPropertyTest.class,
        com.dslplatform.ocd.aggregates.AggregateTypeWithSurrogateKeyAndOneBooleanPropertyTest.class,
        com.dslplatform.ocd.aggregates.AggregateTypeWithSurrogateKeyAndOneListOfNullableBooleansPropertyTest.class,
        com.dslplatform.ocd.aggregates.AggregateTypeWithSurrogateKeyAndOneListOfOneBooleansPropertyTest.class,
        com.dslplatform.ocd.aggregates.AggregateTypeWithSurrogateKeyAndOneSetOfNullableBooleansPropertyTest.class,
        com.dslplatform.ocd.aggregates.AggregateTypeWithSurrogateKeyAndOneSetOfOneBooleansPropertyTest.class
    };

    public static TestSuite suite() {
        final TestSuite suite = new TestSuite();
        for (final Class<?> clazz : TEST_CLASSES) {
            suite.addTest(new JUnit4TestAdapter(clazz));
        }
        return suite;
     }
}
