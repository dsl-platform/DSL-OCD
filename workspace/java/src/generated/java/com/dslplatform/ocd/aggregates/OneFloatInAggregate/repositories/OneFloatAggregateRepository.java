package com.dslplatform.ocd.aggregates.OneFloatInAggregate.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class OneFloatAggregateRepository
        extends
        ClientPersistableRepository<com.dslplatform.ocd.aggregates.OneFloatInAggregate.OneFloatAggregate> {
    public OneFloatAggregateRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.aggregates.OneFloatInAggregate.OneFloatAggregate.class,
                locator);
    }
}
