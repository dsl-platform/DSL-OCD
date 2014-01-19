package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class OneSetOfNullableBooleans_6GridRepository
        extends
        ClientRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneSetOfNullableBooleans_6Grid> {
    public OneSetOfNullableBooleans_6GridRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneSetOfNullableBooleans_6Grid.class,
                locator);
    }

    public OneSetOfNullableBooleans_6GridRepository() {
        this(Bootstrap.getLocator());
    }
}
