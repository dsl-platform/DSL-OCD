package com.dslplatform.ocd.aggregates.ListDoubleInAggregate.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class ListDoubleAggregateRepository
        extends
        ClientPersistableRepository<com.dslplatform.ocd.aggregates.ListDoubleInAggregate.ListDoubleAggregate> {
    public ListDoubleAggregateRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.aggregates.ListDoubleInAggregate.ListDoubleAggregate.class,
                locator);
    }
}
