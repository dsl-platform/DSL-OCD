package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class NullableArrayOfNullableIntegers_5GridRepository
        extends
        ClientRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableArrayOfNullableIntegers_5Grid> {
    public NullableArrayOfNullableIntegers_5GridRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableArrayOfNullableIntegers_5Grid.class,
                locator);
    }

    public NullableArrayOfNullableIntegers_5GridRepository() {
        this(Bootstrap.getLocator());
    }
}
