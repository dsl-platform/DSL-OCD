package model.CalculatedTestsCollections.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class TestCollectionsRepository
        extends
        ClientPersistableRepository<model.CalculatedTestsCollections.TestCollections> {
    public TestCollectionsRepository(
            final ServiceLocator locator) {
        super(model.CalculatedTestsCollections.TestCollections.class, locator);
    }
}
