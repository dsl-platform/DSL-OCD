package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class NullableArrayOfOneIntegers_5GridRepository
        extends
        ClientRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableArrayOfOneIntegers_5Grid> {
    public NullableArrayOfOneIntegers_5GridRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableArrayOfOneIntegers_5Grid.class,
                locator);
    }

    public NullableArrayOfOneIntegers_5GridRepository() {
        this(Bootstrap.getLocator());
    }
}
