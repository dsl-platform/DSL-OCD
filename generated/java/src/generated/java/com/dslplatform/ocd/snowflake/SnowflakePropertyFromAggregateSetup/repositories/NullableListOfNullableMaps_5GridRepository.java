package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class NullableListOfNullableMaps_5GridRepository
        extends
        ClientRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableListOfNullableMaps_5Grid> {
    public NullableListOfNullableMaps_5GridRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableListOfNullableMaps_5Grid.class,
                locator);
    }

    public NullableListOfNullableMaps_5GridRepository() {
        this(Bootstrap.getLocator());
    }
}
