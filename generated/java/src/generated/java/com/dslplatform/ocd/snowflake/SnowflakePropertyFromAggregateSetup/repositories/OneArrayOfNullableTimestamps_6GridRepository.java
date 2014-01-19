package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class OneArrayOfNullableTimestamps_6GridRepository
        extends
        ClientRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneArrayOfNullableTimestamps_6Grid> {
    public OneArrayOfNullableTimestamps_6GridRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneArrayOfNullableTimestamps_6Grid.class,
                locator);
    }

    public OneArrayOfNullableTimestamps_6GridRepository() {
        this(Bootstrap.getLocator());
    }
}
