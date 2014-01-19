package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class NullableTimestamp_5GridRepository
        extends
        ClientRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableTimestamp_5Grid> {
    public NullableTimestamp_5GridRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableTimestamp_5Grid.class,
                locator);
    }

    public NullableTimestamp_5GridRepository() {
        this(Bootstrap.getLocator());
    }
}
