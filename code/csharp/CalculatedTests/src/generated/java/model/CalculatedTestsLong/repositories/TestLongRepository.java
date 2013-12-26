package model.CalculatedTestsLong.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class TestLongRepository extends
        ClientPersistableRepository<model.CalculatedTestsLong.TestLong> {
    public TestLongRepository(
            final ServiceLocator locator) {
        super(model.CalculatedTestsLong.TestLong.class, locator);
    }
}
