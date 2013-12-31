package com.dslplatform.ocd.aggregates.SetDateInAggregate.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class SetDateAggregateRepository
        extends
        ClientPersistableRepository<com.dslplatform.ocd.aggregates.SetDateInAggregate.SetDateAggregate> {
    public SetDateAggregateRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.aggregates.SetDateInAggregate.SetDateAggregate.class,
                locator);
    }
}
