package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class NullableSetOfOneBooleans_5GridRepository
        extends
        ClientRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableSetOfOneBooleans_5Grid> {
    public NullableSetOfOneBooleans_5GridRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableSetOfOneBooleans_5Grid.class,
                locator);
    }

    public NullableSetOfOneBooleans_5GridRepository() {
        this(Bootstrap.getLocator());
    }
}
