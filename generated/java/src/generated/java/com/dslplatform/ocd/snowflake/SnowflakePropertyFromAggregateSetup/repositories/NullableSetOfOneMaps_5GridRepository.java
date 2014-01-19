package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class NullableSetOfOneMaps_5GridRepository
        extends
        ClientRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableSetOfOneMaps_5Grid> {
    public NullableSetOfOneMaps_5GridRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableSetOfOneMaps_5Grid.class,
                locator);
    }

    public NullableSetOfOneMaps_5GridRepository() {
        this(Bootstrap.getLocator());
    }
}
