package com.dslplatform.ocd.aggregates.SetBoolInAggregate.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class SetBoolAggregateRepository
        extends
        ClientPersistableRepository<com.dslplatform.ocd.aggregates.SetBoolInAggregate.SetBoolAggregate> {
    public SetBoolAggregateRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.aggregates.SetBoolInAggregate.SetBoolAggregate.class,
                locator);
    }
}
