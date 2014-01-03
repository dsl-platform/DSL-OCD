package model.CalculatedTestsFloat.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class TestFloatRepository extends
        ClientPersistableRepository<model.CalculatedTestsFloat.TestFloat> {
    public TestFloatRepository(
            final ServiceLocator locator) {
        super(model.CalculatedTestsFloat.TestFloat.class, locator);
    }
}
