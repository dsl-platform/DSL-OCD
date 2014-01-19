package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class OneSetOfNullableTimestamps_6GridRepository
        extends
        ClientRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneSetOfNullableTimestamps_6Grid> {
    public OneSetOfNullableTimestamps_6GridRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneSetOfNullableTimestamps_6Grid.class,
                locator);
    }

    public OneSetOfNullableTimestamps_6GridRepository() {
        this(Bootstrap.getLocator());
    }
}
