package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class NullableListOfOneBinaries_5GridRepository
        extends
        ClientRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableListOfOneBinaries_5Grid> {
    public NullableListOfOneBinaries_5GridRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableListOfOneBinaries_5Grid.class,
                locator);
    }

    public NullableListOfOneBinaries_5GridRepository() {
        this(Bootstrap.getLocator());
    }
}
