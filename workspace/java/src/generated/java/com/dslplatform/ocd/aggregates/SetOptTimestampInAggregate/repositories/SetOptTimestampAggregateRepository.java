package com.dslplatform.ocd.aggregates.SetOptTimestampInAggregate.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class SetOptTimestampAggregateRepository
        extends
        ClientPersistableRepository<com.dslplatform.ocd.aggregates.SetOptTimestampInAggregate.SetOptTimestampAggregate> {
    public SetOptTimestampAggregateRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.aggregates.SetOptTimestampInAggregate.SetOptTimestampAggregate.class,
                locator);
    }
}
