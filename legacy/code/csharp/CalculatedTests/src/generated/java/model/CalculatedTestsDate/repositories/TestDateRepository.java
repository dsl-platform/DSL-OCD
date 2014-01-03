package model.CalculatedTestsDate.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class TestDateRepository extends
        ClientPersistableRepository<model.CalculatedTestsDate.TestDate> {
    public TestDateRepository(
            final ServiceLocator locator) {
        super(model.CalculatedTestsDate.TestDate.class, locator);
    }
}
