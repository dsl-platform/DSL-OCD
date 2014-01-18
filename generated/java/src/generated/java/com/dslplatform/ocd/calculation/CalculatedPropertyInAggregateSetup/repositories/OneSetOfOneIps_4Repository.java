package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class OneSetOfOneIps_4Repository
        extends
        ClientPersistableRepository<com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneSetOfOneIps_4> {
    public OneSetOfOneIps_4Repository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneSetOfOneIps_4.class,
                locator);
    }
}
