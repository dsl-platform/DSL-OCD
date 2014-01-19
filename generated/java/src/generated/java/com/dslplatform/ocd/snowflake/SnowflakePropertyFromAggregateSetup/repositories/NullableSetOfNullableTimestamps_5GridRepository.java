package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class NullableSetOfNullableTimestamps_5GridRepository
        extends
        ClientRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableSetOfNullableTimestamps_5Grid> {
    public NullableSetOfNullableTimestamps_5GridRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableSetOfNullableTimestamps_5Grid.class,
                locator);
    }

    public NullableSetOfNullableTimestamps_5GridRepository() {
        this(Bootstrap.getLocator());
    }
}
