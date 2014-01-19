package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class OneArrayOfOneIntegers_6GridRepository
        extends
        ClientRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneArrayOfOneIntegers_6Grid> {
    public OneArrayOfOneIntegers_6GridRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneArrayOfOneIntegers_6Grid.class,
                locator);
    }

    public OneArrayOfOneIntegers_6GridRepository() {
        this(Bootstrap.getLocator());
    }
}
