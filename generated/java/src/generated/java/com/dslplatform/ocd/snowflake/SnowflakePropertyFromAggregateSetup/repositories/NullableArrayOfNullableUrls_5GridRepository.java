package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class NullableArrayOfNullableUrls_5GridRepository
        extends
        ClientRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableArrayOfNullableUrls_5Grid> {
    public NullableArrayOfNullableUrls_5GridRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableArrayOfNullableUrls_5Grid.class,
                locator);
    }

    public NullableArrayOfNullableUrls_5GridRepository() {
        this(Bootstrap.getLocator());
    }
}
