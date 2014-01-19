package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class NullableListOfOneMaps_5GridRepository
        extends
        ClientRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableListOfOneMaps_5Grid> {
    public NullableListOfOneMaps_5GridRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableListOfOneMaps_5Grid.class,
                locator);
    }

    public NullableListOfOneMaps_5GridRepository() {
        this(Bootstrap.getLocator());
    }
}
