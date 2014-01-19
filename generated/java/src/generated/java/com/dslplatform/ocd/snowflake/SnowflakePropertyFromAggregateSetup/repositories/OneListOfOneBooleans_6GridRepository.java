package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class OneListOfOneBooleans_6GridRepository
        extends
        ClientRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneListOfOneBooleans_6Grid> {
    public OneListOfOneBooleans_6GridRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneListOfOneBooleans_6Grid.class,
                locator);
    }

    public OneListOfOneBooleans_6GridRepository() {
        this(Bootstrap.getLocator());
    }
}
