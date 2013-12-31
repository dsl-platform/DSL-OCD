package com.dslplatform.ocd.aggregates.SetDecimalInAggregate.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class SetDecimalAggregateRepository
        extends
        ClientPersistableRepository<com.dslplatform.ocd.aggregates.SetDecimalInAggregate.SetDecimalAggregate> {
    public SetDecimalAggregateRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.aggregates.SetDecimalInAggregate.SetDecimalAggregate.class,
                locator);
    }
}
