package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class NullableArrayOfNullableTimestamps_5GridRepository
        extends
        ClientRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableArrayOfNullableTimestamps_5Grid> {
    public NullableArrayOfNullableTimestamps_5GridRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableArrayOfNullableTimestamps_5Grid.class,
                locator);
    }

    public NullableArrayOfNullableTimestamps_5GridRepository() {
        this(Bootstrap.getLocator());
    }
}
