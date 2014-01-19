package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class OneListOfNullableImages_6GridRepository
        extends
        ClientRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneListOfNullableImages_6Grid> {
    public OneListOfNullableImages_6GridRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneListOfNullableImages_6Grid.class,
                locator);
    }

    public OneListOfNullableImages_6GridRepository() {
        this(Bootstrap.getLocator());
    }
}
