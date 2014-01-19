package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class NullableArrayOfOneDecimals_5GridRepository
        extends
        ClientRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableArrayOfOneDecimals_5Grid> {
    public NullableArrayOfOneDecimals_5GridRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableArrayOfOneDecimals_5Grid.class,
                locator);
    }

    public NullableArrayOfOneDecimals_5GridRepository() {
        this(Bootstrap.getLocator());
    }
}
