package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class NullableListOfNullableTimestamps_5GridRepository
        extends
        ClientRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableListOfNullableTimestamps_5Grid> {
    public NullableListOfNullableTimestamps_5GridRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableListOfNullableTimestamps_5Grid.class,
                locator);
    }

    public NullableListOfNullableTimestamps_5GridRepository() {
        this(Bootstrap.getLocator());
    }
}
