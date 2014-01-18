package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class OneListOfOneDecimalsWithScaleOf9_4Repository
        extends
        ClientPersistableRepository<com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneListOfOneDecimalsWithScaleOf9_4> {
    public OneListOfOneDecimalsWithScaleOf9_4Repository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneListOfOneDecimalsWithScaleOf9_4.class,
                locator);
    }
}
