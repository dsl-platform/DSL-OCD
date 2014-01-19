package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class NullableSetOfOneDecimals_5GridRepository
        extends
        ClientRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableSetOfOneDecimals_5Grid> {
    public NullableSetOfOneDecimals_5GridRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableSetOfOneDecimals_5Grid.class,
                locator);
    }

    public NullableSetOfOneDecimals_5GridRepository() {
        this(Bootstrap.getLocator());
    }
}
