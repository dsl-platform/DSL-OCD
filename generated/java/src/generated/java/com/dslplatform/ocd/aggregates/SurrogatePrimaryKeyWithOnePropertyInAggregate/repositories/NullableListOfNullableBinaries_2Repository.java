package com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class NullableListOfNullableBinaries_2Repository
        extends
        ClientPersistableRepository<com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.NullableListOfNullableBinaries_2> {
    public NullableListOfNullableBinaries_2Repository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.NullableListOfNullableBinaries_2.class,
                locator);
    }
}
