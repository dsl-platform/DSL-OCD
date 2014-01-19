package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class OneListOfOneTimestamps_6GridRepository
        extends
        ClientRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneListOfOneTimestamps_6Grid> {
    public OneListOfOneTimestamps_6GridRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneListOfOneTimestamps_6Grid.class,
                locator);
    }

    public OneListOfOneTimestamps_6GridRepository() {
        this(Bootstrap.getLocator());
    }
}
