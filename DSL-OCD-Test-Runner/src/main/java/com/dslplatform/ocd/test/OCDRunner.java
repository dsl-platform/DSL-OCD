package com.dslplatform.ocd.test;

import org.junit.Ignore;
import org.junit.runner.Description;
import org.junit.runner.Runner;
import org.junit.runner.notification.RunNotifier;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.InitializationError;
import org.junit.runners.model.RunnerBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

/**
 * A runner for individual tests in the OCD test framework.
 */
public class OCDRunner extends BlockJUnit4ClassRunner {

    private static final String OCD_TEST_METHOD_NAME_KEY = "ocdTestMethodName";

    public static class Builder extends RunnerBuilder {
        final private static Logger logger = LoggerFactory.getLogger("ocd-test-runner-logger");

        @Override
        public Runner runnerForClass(final Class<?> testClass) throws Throwable {
            logger.trace("Building a new OCDRunner...");
            return new OCDRunner(testClass);
        }
    }

    final private static Logger logger = LoggerFactory.getLogger("ocd-test-runner-logger");

    public OCDRunner(final Class<?> klass) throws InitializationError {
        super(klass);
        logger.trace("Built a new OCDRunner");
    }

    @Override
    protected void runChild(final FrameworkMethod method, final RunNotifier notifier) {
        final Description description = describeChild(method);
        if (method.getAnnotation(Ignore.class) != null) {
            notifier.fireTestIgnored(description);
        } else {
            /* Insert test markings, and put the test name on the logging context*/
            final String methodName = description.getMethodName();
            MDC.put(OCD_TEST_METHOD_NAME_KEY, methodName);
            logger.trace("\\OCD_BEGIN_TEST '"+methodName);
            runLeaf(methodBlock(method), description, notifier);
            logger.trace("\\OCD_END_TEST '"+methodName);
            MDC.remove(OCD_TEST_METHOD_NAME_KEY);
        }
    }

}
