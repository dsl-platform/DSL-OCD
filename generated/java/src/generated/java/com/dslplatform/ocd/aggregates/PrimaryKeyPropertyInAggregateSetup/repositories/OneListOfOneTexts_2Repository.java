package com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class OneListOfOneTexts_2Repository
        extends
        ClientPersistableRepository<com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneListOfOneTexts_2> {
    public OneListOfOneTexts_2Repository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneListOfOneTexts_2.class,
                locator);
    }
}
