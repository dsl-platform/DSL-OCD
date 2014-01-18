package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class OneIp_4Repository
        extends
        ClientPersistableRepository<com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneIp_4> {
    public OneIp_4Repository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneIp_4.class,
                locator);
    }
}
