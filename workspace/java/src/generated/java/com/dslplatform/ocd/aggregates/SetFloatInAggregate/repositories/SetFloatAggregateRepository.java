package com.dslplatform.ocd.aggregates.SetFloatInAggregate.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class SetFloatAggregateRepository
        extends
        ClientPersistableRepository<com.dslplatform.ocd.aggregates.SetFloatInAggregate.SetFloatAggregate> {
    public SetFloatAggregateRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.aggregates.SetFloatInAggregate.SetFloatAggregate.class,
                locator);
    }
}
