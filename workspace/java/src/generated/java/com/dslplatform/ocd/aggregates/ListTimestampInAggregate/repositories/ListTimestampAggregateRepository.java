package com.dslplatform.ocd.aggregates.ListTimestampInAggregate.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class ListTimestampAggregateRepository
        extends
        ClientPersistableRepository<com.dslplatform.ocd.aggregates.ListTimestampInAggregate.ListTimestampAggregate> {
    public ListTimestampAggregateRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.aggregates.ListTimestampInAggregate.ListTimestampAggregate.class,
                locator);
    }
}
