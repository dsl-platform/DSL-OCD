package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class OneTimestamp_4Repository
        extends
        ClientPersistableRepository<com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneTimestamp_4> {
    public OneTimestamp_4Repository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneTimestamp_4.class,
                locator);
    }
}
