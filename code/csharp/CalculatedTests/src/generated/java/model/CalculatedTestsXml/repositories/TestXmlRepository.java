package model.CalculatedTestsXml.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class TestXmlRepository extends
        ClientPersistableRepository<model.CalculatedTestsXml.TestXml> {
    public TestXmlRepository(
            final ServiceLocator locator) {
        super(model.CalculatedTestsXml.TestXml.class, locator);
    }
}
