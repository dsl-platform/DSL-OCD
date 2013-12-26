package model.CalculatedTestsMoney.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class TestMoneyRepository extends
        ClientPersistableRepository<model.CalculatedTestsMoney.TestMoney> {
    public TestMoneyRepository(
            final ServiceLocator locator) {
        super(model.CalculatedTestsMoney.TestMoney.class, locator);
    }
}
