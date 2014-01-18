package com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class OneListOfNullableLongs_2Repository
        extends
        ClientPersistableRepository<com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneListOfNullableLongs_2> {
    public OneListOfNullableLongs_2Repository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneListOfNullableLongs_2.class,
                locator);
    }
}
