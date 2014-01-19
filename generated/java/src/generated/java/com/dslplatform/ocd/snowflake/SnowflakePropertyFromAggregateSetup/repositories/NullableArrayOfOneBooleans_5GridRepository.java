package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class NullableArrayOfOneBooleans_5GridRepository
        extends
        ClientRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableArrayOfOneBooleans_5Grid> {
    public NullableArrayOfOneBooleans_5GridRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableArrayOfOneBooleans_5Grid.class,
                locator);
    }

    public NullableArrayOfOneBooleans_5GridRepository() {
        this(Bootstrap.getLocator());
    }
}
