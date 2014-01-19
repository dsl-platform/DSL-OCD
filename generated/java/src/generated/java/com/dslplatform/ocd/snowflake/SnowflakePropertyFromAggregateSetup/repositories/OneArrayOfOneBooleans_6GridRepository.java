package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class OneArrayOfOneBooleans_6GridRepository
        extends
        ClientRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneArrayOfOneBooleans_6Grid> {
    public OneArrayOfOneBooleans_6GridRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneArrayOfOneBooleans_6Grid.class,
                locator);
    }

    public OneArrayOfOneBooleans_6GridRepository() {
        this(Bootstrap.getLocator());
    }
}
