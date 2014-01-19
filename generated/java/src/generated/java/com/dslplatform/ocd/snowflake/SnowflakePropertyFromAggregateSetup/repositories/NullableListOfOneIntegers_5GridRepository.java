package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class NullableListOfOneIntegers_5GridRepository
        extends
        ClientRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableListOfOneIntegers_5Grid> {
    public NullableListOfOneIntegers_5GridRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableListOfOneIntegers_5Grid.class,
                locator);
    }

    public NullableListOfOneIntegers_5GridRepository() {
        this(Bootstrap.getLocator());
    }
}
