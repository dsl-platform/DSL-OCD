package model.CalculatedTestsGuid.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class TestGuidRepository extends
        ClientPersistableRepository<model.CalculatedTestsGuid.TestGuid> {
    public TestGuidRepository(
            final ServiceLocator locator) {
        super(model.CalculatedTestsGuid.TestGuid.class, locator);
    }
}
