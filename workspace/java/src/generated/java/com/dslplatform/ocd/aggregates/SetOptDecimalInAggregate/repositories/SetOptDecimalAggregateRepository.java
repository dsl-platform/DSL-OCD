package com.dslplatform.ocd.aggregates.SetOptDecimalInAggregate.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class SetOptDecimalAggregateRepository
        extends
        ClientPersistableRepository<com.dslplatform.ocd.aggregates.SetOptDecimalInAggregate.SetOptDecimalAggregate> {
    public SetOptDecimalAggregateRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.aggregates.SetOptDecimalInAggregate.SetOptDecimalAggregate.class,
                locator);
    }
}
