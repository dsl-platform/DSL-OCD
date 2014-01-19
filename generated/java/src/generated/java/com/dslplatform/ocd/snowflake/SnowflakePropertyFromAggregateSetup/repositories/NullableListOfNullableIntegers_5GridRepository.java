package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class NullableListOfNullableIntegers_5GridRepository
        extends
        ClientRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableListOfNullableIntegers_5Grid> {
    public NullableListOfNullableIntegers_5GridRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableListOfNullableIntegers_5Grid.class,
                locator);
    }

    public NullableListOfNullableIntegers_5GridRepository() {
        this(Bootstrap.getLocator());
    }
}
