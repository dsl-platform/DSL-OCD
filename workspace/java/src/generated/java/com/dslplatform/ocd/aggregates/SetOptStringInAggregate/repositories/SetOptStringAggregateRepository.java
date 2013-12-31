package com.dslplatform.ocd.aggregates.SetOptStringInAggregate.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class SetOptStringAggregateRepository
        extends
        ClientPersistableRepository<com.dslplatform.ocd.aggregates.SetOptStringInAggregate.SetOptStringAggregate> {
    public SetOptStringAggregateRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.aggregates.SetOptStringInAggregate.SetOptStringAggregate.class,
                locator);
    }
}
