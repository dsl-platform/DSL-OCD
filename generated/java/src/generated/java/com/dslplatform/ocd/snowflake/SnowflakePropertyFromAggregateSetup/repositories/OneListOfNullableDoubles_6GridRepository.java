package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class OneListOfNullableDoubles_6GridRepository
        extends
        ClientRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneListOfNullableDoubles_6Grid> {
    public OneListOfNullableDoubles_6GridRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneListOfNullableDoubles_6Grid.class,
                locator);
    }

    public OneListOfNullableDoubles_6GridRepository() {
        this(Bootstrap.getLocator());
    }
}
