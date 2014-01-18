package com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class OneSetOfNullableDates_3Repository
        extends
        ClientPersistableRepository<com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.OneSetOfNullableDates_3> {
    public OneSetOfNullableDates_3Repository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.OneSetOfNullableDates_3.class,
                locator);
    }
}
