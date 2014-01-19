package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class OneListOfNullableLocations_5GridRepository
        extends
        ClientRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneListOfNullableLocations_5Grid> {
    public OneListOfNullableLocations_5GridRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneListOfNullableLocations_5Grid.class,
                locator);
    }

    public OneListOfNullableLocations_5GridRepository() {
        this(Bootstrap.getLocator());
    }
}
