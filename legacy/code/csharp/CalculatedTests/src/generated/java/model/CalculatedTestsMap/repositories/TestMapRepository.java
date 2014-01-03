package model.CalculatedTestsMap.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class TestMapRepository extends
        ClientPersistableRepository<model.CalculatedTestsMap.TestMap> {
    public TestMapRepository(
            final ServiceLocator locator) {
        super(model.CalculatedTestsMap.TestMap.class, locator);
    }
}
