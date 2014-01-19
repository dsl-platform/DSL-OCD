package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class NullableArrayOfNullableBooleans_5GridRepository
        extends
        ClientRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableArrayOfNullableBooleans_5Grid> {
    public NullableArrayOfNullableBooleans_5GridRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableArrayOfNullableBooleans_5Grid.class,
                locator);
    }

    public NullableArrayOfNullableBooleans_5GridRepository() {
        this(Bootstrap.getLocator());
    }
}
