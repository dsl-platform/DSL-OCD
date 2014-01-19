package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class NullableSetOfOneIntegers_5GridRepository
        extends
        ClientRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableSetOfOneIntegers_5Grid> {
    public NullableSetOfOneIntegers_5GridRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableSetOfOneIntegers_5Grid.class,
                locator);
    }

    public NullableSetOfOneIntegers_5GridRepository() {
        this(Bootstrap.getLocator());
    }
}
