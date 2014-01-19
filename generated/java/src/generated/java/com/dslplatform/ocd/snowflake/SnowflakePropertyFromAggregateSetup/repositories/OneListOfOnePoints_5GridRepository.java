package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class OneListOfOnePoints_5GridRepository
        extends
        ClientRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneListOfOnePoints_5Grid> {
    public OneListOfOnePoints_5GridRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneListOfOnePoints_5Grid.class,
                locator);
    }

    public OneListOfOnePoints_5GridRepository() {
        this(Bootstrap.getLocator());
    }
}
