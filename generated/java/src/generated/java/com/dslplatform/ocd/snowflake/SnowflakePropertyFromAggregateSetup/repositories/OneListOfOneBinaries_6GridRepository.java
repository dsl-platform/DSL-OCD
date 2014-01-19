package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class OneListOfOneBinaries_6GridRepository
        extends
        ClientRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneListOfOneBinaries_6Grid> {
    public OneListOfOneBinaries_6GridRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneListOfOneBinaries_6Grid.class,
                locator);
    }

    public OneListOfOneBinaries_6GridRepository() {
        this(Bootstrap.getLocator());
    }
}
