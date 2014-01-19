package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class OneListOfNullableXmls_5GridRepository
        extends
        ClientRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneListOfNullableXmls_5Grid> {
    public OneListOfNullableXmls_5GridRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneListOfNullableXmls_5Grid.class,
                locator);
    }

    public OneListOfNullableXmls_5GridRepository() {
        this(Bootstrap.getLocator());
    }
}
