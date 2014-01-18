package com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class OneGuid_2Repository
        extends
        ClientPersistableRepository<com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneGuid_2> {
    public OneGuid_2Repository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneGuid_2.class,
                locator);
    }
}
