package com.dslplatform.ocd.test;

import junit.framework.JUnit4TestAdapter;
import junit.framework.TestSuite;
import org.junit.runner.RunWith;
import org.junit.runners.AllTests;

@RunWith(AllTests.class)
public class TestEntryPoint {

    private static final Class<?>[] TEST_CLASSES = {
        com.dslplatform.ocd.aggregates.AggregateTypeWithSurrogateKeyAndNullableArrayOfNullablePointsPropertyTest.class,
        com.dslplatform.ocd.aggregates.AggregateTypeWithSurrogateKeyAndNullableArrayOfOnePointsPropertyTest.class,
        com.dslplatform.ocd.aggregates.AggregateTypeWithSurrogateKeyAndNullableListOfNullablePointsPropertyTest.class,
        com.dslplatform.ocd.aggregates.AggregateTypeWithSurrogateKeyAndNullableListOfOnePointsPropertyTest.class,
        com.dslplatform.ocd.aggregates.AggregateTypeWithSurrogateKeyAndNullablePointPropertyTest.class,
        com.dslplatform.ocd.aggregates.AggregateTypeWithSurrogateKeyAndNullableSetOfNullablePointsPropertyTest.class,
        com.dslplatform.ocd.aggregates.AggregateTypeWithSurrogateKeyAndNullableSetOfOnePointsPropertyTest.class,
        com.dslplatform.ocd.aggregates.AggregateTypeWithSurrogateKeyAndOneArrayOfNullablePointsPropertyTest.class,
        com.dslplatform.ocd.aggregates.AggregateTypeWithSurrogateKeyAndOneArrayOfOnePointsPropertyTest.class,
        com.dslplatform.ocd.aggregates.AggregateTypeWithSurrogateKeyAndOneListOfNullablePointsPropertyTest.class,
        com.dslplatform.ocd.aggregates.AggregateTypeWithSurrogateKeyAndOneListOfOnePointsPropertyTest.class,
        com.dslplatform.ocd.aggregates.AggregateTypeWithSurrogateKeyAndOnePointPropertyTest.class,
        com.dslplatform.ocd.aggregates.AggregateTypeWithSurrogateKeyAndOneSetOfNullablePointsPropertyTest.class,
        com.dslplatform.ocd.aggregates.AggregateTypeWithSurrogateKeyAndOneSetOfOnePointsPropertyTest.class
    };

    public static TestSuite suite() {
        final TestSuite suite = new TestSuite();
        for (final Class<?> clazz : TEST_CLASSES) {
            suite.addTest(new JUnit4TestAdapter(clazz));
        }
        return suite;
     }
}
