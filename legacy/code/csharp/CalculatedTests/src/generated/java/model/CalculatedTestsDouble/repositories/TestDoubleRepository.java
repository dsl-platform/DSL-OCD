package model.CalculatedTestsDouble.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class TestDoubleRepository extends
        ClientPersistableRepository<model.CalculatedTestsDouble.TestDouble> {
    public TestDoubleRepository(
            final ServiceLocator locator) {
        super(model.CalculatedTestsDouble.TestDouble.class, locator);
    }
}
