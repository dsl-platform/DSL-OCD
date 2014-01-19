package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class OneListOfOneDoubles_6GridRepository
        extends
        ClientRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneListOfOneDoubles_6Grid> {
    public OneListOfOneDoubles_6GridRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneListOfOneDoubles_6Grid.class,
                locator);
    }

    public OneListOfOneDoubles_6GridRepository() {
        this(Bootstrap.getLocator());
    }
}
