package com.dslplatform.ocd.aggregates.ListDateInAggregate.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class ListDateAggregateRepository
        extends
        ClientPersistableRepository<com.dslplatform.ocd.aggregates.ListDateInAggregate.ListDateAggregate> {
    public ListDateAggregateRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.aggregates.ListDateInAggregate.ListDateAggregate.class,
                locator);
    }
}
