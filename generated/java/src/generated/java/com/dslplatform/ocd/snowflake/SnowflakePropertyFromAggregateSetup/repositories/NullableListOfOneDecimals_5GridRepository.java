package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class NullableListOfOneDecimals_5GridRepository
        extends
        ClientRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableListOfOneDecimals_5Grid> {
    public NullableListOfOneDecimals_5GridRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableListOfOneDecimals_5Grid.class,
                locator);
    }

    public NullableListOfOneDecimals_5GridRepository() {
        this(Bootstrap.getLocator());
    }
}
