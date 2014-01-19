package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class OneListOfOneImages_6GridRepository
        extends
        ClientRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneListOfOneImages_6Grid> {
    public OneListOfOneImages_6GridRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneListOfOneImages_6Grid.class,
                locator);
    }

    public OneListOfOneImages_6GridRepository() {
        this(Bootstrap.getLocator());
    }
}
