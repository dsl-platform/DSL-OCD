package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class OneListOfNullableDecimals_6GridRepository
        extends
        ClientRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneListOfNullableDecimals_6Grid> {
    public OneListOfNullableDecimals_6GridRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneListOfNullableDecimals_6Grid.class,
                locator);
    }

    public OneListOfNullableDecimals_6GridRepository() {
        this(Bootstrap.getLocator());
    }
}
