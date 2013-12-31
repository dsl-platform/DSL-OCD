package com.dslplatform.ocd.aggregates.OneDecimalInAggregate.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class OneDecimalAggregateRepository
        extends
        ClientPersistableRepository<com.dslplatform.ocd.aggregates.OneDecimalInAggregate.OneDecimalAggregate> {
    public OneDecimalAggregateRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.aggregates.OneDecimalInAggregate.OneDecimalAggregate.class,
                locator);
    }
}
