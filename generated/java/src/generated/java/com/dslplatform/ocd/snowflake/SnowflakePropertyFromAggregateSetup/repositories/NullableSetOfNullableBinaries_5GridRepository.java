package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class NullableSetOfNullableBinaries_5GridRepository
        extends
        ClientRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableSetOfNullableBinaries_5Grid> {
    public NullableSetOfNullableBinaries_5GridRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableSetOfNullableBinaries_5Grid.class,
                locator);
    }

    public NullableSetOfNullableBinaries_5GridRepository() {
        this(Bootstrap.getLocator());
    }
}
