package com.dslplatform.ocd.aggregates.ListDecimalInAggregate.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class ListDecimalAggregateRepository
        extends
        ClientPersistableRepository<com.dslplatform.ocd.aggregates.ListDecimalInAggregate.ListDecimalAggregate> {
    public ListDecimalAggregateRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.aggregates.ListDecimalInAggregate.ListDecimalAggregate.class,
                locator);
    }
}
