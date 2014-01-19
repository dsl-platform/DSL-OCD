package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class OneArrayOfNullableBooleans_6GridRepository
        extends
        ClientRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneArrayOfNullableBooleans_6Grid> {
    public OneArrayOfNullableBooleans_6GridRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneArrayOfNullableBooleans_6Grid.class,
                locator);
    }

    public OneArrayOfNullableBooleans_6GridRepository() {
        this(Bootstrap.getLocator());
    }
}
