package com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class OneListOfNullableDecimalsWithScaleOf9_2Repository
        extends
        ClientPersistableRepository<com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneListOfNullableDecimalsWithScaleOf9_2> {
    public OneListOfNullableDecimalsWithScaleOf9_2Repository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneListOfNullableDecimalsWithScaleOf9_2.class,
                locator);
    }
}