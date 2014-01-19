package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class OneSetOfNullableLocations_5GridRepository
        extends
        ClientRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneSetOfNullableLocations_5Grid> {
    public OneSetOfNullableLocations_5GridRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneSetOfNullableLocations_5Grid.class,
                locator);
    }

    public OneSetOfNullableLocations_5GridRepository() {
        this(Bootstrap.getLocator());
    }
}
