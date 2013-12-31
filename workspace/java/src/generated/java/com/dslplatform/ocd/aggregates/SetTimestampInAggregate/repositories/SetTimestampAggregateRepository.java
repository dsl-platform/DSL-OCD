package com.dslplatform.ocd.aggregates.SetTimestampInAggregate.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class SetTimestampAggregateRepository
        extends
        ClientPersistableRepository<com.dslplatform.ocd.aggregates.SetTimestampInAggregate.SetTimestampAggregate> {
    public SetTimestampAggregateRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.aggregates.SetTimestampInAggregate.SetTimestampAggregate.class,
                locator);
    }
}
