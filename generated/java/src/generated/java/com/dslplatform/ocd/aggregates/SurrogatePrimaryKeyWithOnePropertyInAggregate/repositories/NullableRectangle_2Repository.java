package com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class NullableRectangle_2Repository
        extends
        ClientPersistableRepository<com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.NullableRectangle_2> {
    public NullableRectangle_2Repository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.NullableRectangle_2.class,
                locator);
    }
}