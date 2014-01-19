package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class OneArrayOfNullableIntegers_6GridRepository
        extends
        ClientRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneArrayOfNullableIntegers_6Grid> {
    public OneArrayOfNullableIntegers_6GridRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneArrayOfNullableIntegers_6Grid.class,
                locator);
    }

    public OneArrayOfNullableIntegers_6GridRepository() {
        this(Bootstrap.getLocator());
    }
}
