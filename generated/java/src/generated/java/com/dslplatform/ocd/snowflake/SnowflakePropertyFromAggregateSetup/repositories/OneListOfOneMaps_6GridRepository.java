package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class OneListOfOneMaps_6GridRepository
        extends
        ClientRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneListOfOneMaps_6Grid> {
    public OneListOfOneMaps_6GridRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneListOfOneMaps_6Grid.class,
                locator);
    }

    public OneListOfOneMaps_6GridRepository() {
        this(Bootstrap.getLocator());
    }
}
