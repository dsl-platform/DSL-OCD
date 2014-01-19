package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class OneSetOfOneBooleans_6GridRepository
        extends
        ClientRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneSetOfOneBooleans_6Grid> {
    public OneSetOfOneBooleans_6GridRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneSetOfOneBooleans_6Grid.class,
                locator);
    }

    public OneSetOfOneBooleans_6GridRepository() {
        this(Bootstrap.getLocator());
    }
}
