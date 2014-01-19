package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class OneArrayOfOneTimestamps_6GridRepository
        extends
        ClientRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneArrayOfOneTimestamps_6Grid> {
    public OneArrayOfOneTimestamps_6GridRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneArrayOfOneTimestamps_6Grid.class,
                locator);
    }

    public OneArrayOfOneTimestamps_6GridRepository() {
        this(Bootstrap.getLocator());
    }
}
