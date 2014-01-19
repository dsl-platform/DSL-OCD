package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class OneListOfNullableIntegers_6GridRepository
        extends
        ClientRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneListOfNullableIntegers_6Grid> {
    public OneListOfNullableIntegers_6GridRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneListOfNullableIntegers_6Grid.class,
                locator);
    }

    public OneListOfNullableIntegers_6GridRepository() {
        this(Bootstrap.getLocator());
    }
}
