package model.CalculatedTestsString.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class TestStringRepository extends
        ClientPersistableRepository<model.CalculatedTestsString.TestString> {
    public TestStringRepository(
            final ServiceLocator locator) {
        super(model.CalculatedTestsString.TestString.class, locator);
    }
}
