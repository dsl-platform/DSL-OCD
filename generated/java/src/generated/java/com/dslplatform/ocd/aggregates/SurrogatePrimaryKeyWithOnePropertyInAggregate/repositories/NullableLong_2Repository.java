package com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class NullableLong_2Repository
        extends
        ClientPersistableRepository<com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.NullableLong_2> {
    public NullableLong_2Repository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.NullableLong_2.class,
                locator);
    }
}
