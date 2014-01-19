package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class OneSetOfNullableIntegers_6GridRepository
        extends
        ClientRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneSetOfNullableIntegers_6Grid> {
    public OneSetOfNullableIntegers_6GridRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneSetOfNullableIntegers_6Grid.class,
                locator);
    }

    public OneSetOfNullableIntegers_6GridRepository() {
        this(Bootstrap.getLocator());
    }
}
