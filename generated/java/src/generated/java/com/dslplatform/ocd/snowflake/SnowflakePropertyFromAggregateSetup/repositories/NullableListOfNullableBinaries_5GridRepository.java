package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class NullableListOfNullableBinaries_5GridRepository
        extends
        ClientRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableListOfNullableBinaries_5Grid> {
    public NullableListOfNullableBinaries_5GridRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableListOfNullableBinaries_5Grid.class,
                locator);
    }

    public NullableListOfNullableBinaries_5GridRepository() {
        this(Bootstrap.getLocator());
    }
}
