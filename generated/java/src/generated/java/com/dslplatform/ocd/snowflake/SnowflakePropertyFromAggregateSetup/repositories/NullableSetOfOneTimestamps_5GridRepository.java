package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class NullableSetOfOneTimestamps_5GridRepository
        extends
        ClientRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableSetOfOneTimestamps_5Grid> {
    public NullableSetOfOneTimestamps_5GridRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableSetOfOneTimestamps_5Grid.class,
                locator);
    }

    public NullableSetOfOneTimestamps_5GridRepository() {
        this(Bootstrap.getLocator());
    }
}
