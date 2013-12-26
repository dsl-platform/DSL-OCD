import java.io.IOException;

import com.dslplatform.client.Bootstrap;
import com.dslplatform.patterns.ServiceLocator;
import com.dslplatform.test.*;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Main {
    public static void main(final String[] args) throws IOException {
        /**
         * An instance of Service Locator.
         * You can use it to fetch instances of repositories.
         */
        ServiceLocator locator = init();

        Result result = JUnitCore.runClasses(
          CalculatedTestsBoolean.class,
          CalculatedTestsDate.class,
          CalculatedTestsDouble.class,
          CalculatedTestsFloat.class,
          CalculatedTestsGUID.class,
          CalculatedTestsInt.class,
          CalculatedTestsMap.class,
          CalculatedTestsMoney.class,
          CalculatedTestsString.class,
          CalculatedTestsXml.class
        );

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

        System.out.println("Tests passed: " + result.wasSuccessful());

        shutdown(locator);
    }

    /**
     * Call to initialize an instance of ServiceLocator with a project.ini
     */
    public static ServiceLocator init() throws IOException {
        final ServiceLocator locator =
                Bootstrap.init(Main.class.getResourceAsStream("/project.ini"));
        System.out.println("Locator has been initialized");
        return locator;
    }

    /**
     * ExecutorService will keep on working up to a minute after program has
     * finished. This method is an example how one could quickly exit the
     * program and can be called to speed up application ending.
     *
     * Alternatively, you can also invoke System.exit();
     */
    public static void shutdown(final ServiceLocator locator)
            throws IOException {
        locator.resolve(java.util.concurrent.ExecutorService.class).shutdown();
    }
}
