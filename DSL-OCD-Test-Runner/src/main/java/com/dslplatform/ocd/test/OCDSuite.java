package com.dslplatform.ocd.test;

import org.junit.runners.Suite;
import org.junit.runners.model.InitializationError;
import org.junit.runners.model.RunnerBuilder;


/**
 * A runner for OCD test suites
 */
public class OCDSuite extends Suite {
    public OCDSuite(final Class<?> klass) throws InitializationError {
        this(klass, new OCDRunner.Builder());
    }

    public OCDSuite(final Class<?> klass, final RunnerBuilder builder) throws InitializationError {
        super(klass, builder);
    }
}
