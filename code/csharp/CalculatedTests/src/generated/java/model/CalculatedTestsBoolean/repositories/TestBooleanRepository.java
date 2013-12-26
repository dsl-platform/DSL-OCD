package model.CalculatedTestsBoolean.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class TestBooleanRepository extends
        ClientPersistableRepository<model.CalculatedTestsBoolean.TestBoolean> {
    public TestBooleanRepository(
            final ServiceLocator locator) {
        super(model.CalculatedTestsBoolean.TestBoolean.class, locator);
    }
}
