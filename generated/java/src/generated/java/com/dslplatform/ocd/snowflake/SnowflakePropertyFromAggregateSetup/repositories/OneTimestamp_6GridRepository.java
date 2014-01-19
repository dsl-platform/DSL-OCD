package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class OneTimestamp_6GridRepository
        extends
        ClientRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneTimestamp_6Grid> {
    public OneTimestamp_6GridRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneTimestamp_6Grid.class,
                locator);
    }

    public OneTimestamp_6GridRepository() {
        this(Bootstrap.getLocator());
    }
}
