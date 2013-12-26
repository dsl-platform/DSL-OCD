package model.CalculatedTestsInt.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class TestIntRepository extends
        ClientPersistableRepository<model.CalculatedTestsInt.TestInt> {
    public TestIntRepository(
            final ServiceLocator locator) {
        super(model.CalculatedTestsInt.TestInt.class, locator);
    }
}
