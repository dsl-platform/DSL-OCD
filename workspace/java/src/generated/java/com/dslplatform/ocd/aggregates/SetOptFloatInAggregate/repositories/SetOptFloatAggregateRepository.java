package com.dslplatform.ocd.aggregates.SetOptFloatInAggregate.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class SetOptFloatAggregateRepository
        extends
        ClientPersistableRepository<com.dslplatform.ocd.aggregates.SetOptFloatInAggregate.SetOptFloatAggregate> {
    public SetOptFloatAggregateRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.aggregates.SetOptFloatInAggregate.SetOptFloatAggregate.class,
                locator);
    }
}
