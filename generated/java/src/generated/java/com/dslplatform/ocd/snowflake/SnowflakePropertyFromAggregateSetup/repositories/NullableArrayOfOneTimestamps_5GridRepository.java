package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class NullableArrayOfOneTimestamps_5GridRepository
        extends
        ClientRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableArrayOfOneTimestamps_5Grid> {
    public NullableArrayOfOneTimestamps_5GridRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableArrayOfOneTimestamps_5Grid.class,
                locator);
    }

    public NullableArrayOfOneTimestamps_5GridRepository() {
        this(Bootstrap.getLocator());
    }
}
