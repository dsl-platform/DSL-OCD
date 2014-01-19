package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class OneListOfNullableTimestamps_6GridRepository
        extends
        ClientRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneListOfNullableTimestamps_6Grid> {
    public OneListOfNullableTimestamps_6GridRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneListOfNullableTimestamps_6Grid.class,
                locator);
    }

    public OneListOfNullableTimestamps_6GridRepository() {
        this(Bootstrap.getLocator());
    }
}
