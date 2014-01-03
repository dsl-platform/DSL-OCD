package model.CalculatedTestsTimestamp.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class TestTimestampRepository
        extends
        ClientPersistableRepository<model.CalculatedTestsTimestamp.TestTimestamp> {
    public TestTimestampRepository(
            final ServiceLocator locator) {
        super(model.CalculatedTestsTimestamp.TestTimestamp.class, locator);
    }
}
