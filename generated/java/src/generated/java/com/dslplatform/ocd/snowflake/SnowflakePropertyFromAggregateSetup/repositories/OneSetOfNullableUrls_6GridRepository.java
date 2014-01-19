package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class OneSetOfNullableUrls_6GridRepository
        extends
        ClientRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneSetOfNullableUrls_6Grid> {
    public OneSetOfNullableUrls_6GridRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneSetOfNullableUrls_6Grid.class,
                locator);
    }

    public OneSetOfNullableUrls_6GridRepository() {
        this(Bootstrap.getLocator());
    }
}
