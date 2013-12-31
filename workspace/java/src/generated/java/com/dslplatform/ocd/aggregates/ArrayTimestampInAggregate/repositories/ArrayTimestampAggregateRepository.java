package com.dslplatform.ocd.aggregates.ArrayTimestampInAggregate.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class ArrayTimestampAggregateRepository
        extends
        ClientPersistableRepository<com.dslplatform.ocd.aggregates.ArrayTimestampInAggregate.ArrayTimestampAggregate> {
    public ArrayTimestampAggregateRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.aggregates.ArrayTimestampInAggregate.ArrayTimestampAggregate.class,
                locator);
    }
}
