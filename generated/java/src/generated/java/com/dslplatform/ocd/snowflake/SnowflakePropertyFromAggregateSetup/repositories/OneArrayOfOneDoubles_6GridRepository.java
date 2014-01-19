package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class OneArrayOfOneDoubles_6GridRepository
        extends
        ClientRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneArrayOfOneDoubles_6Grid> {
    public OneArrayOfOneDoubles_6GridRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneArrayOfOneDoubles_6Grid.class,
                locator);
    }

    public OneArrayOfOneDoubles_6GridRepository() {
        this(Bootstrap.getLocator());
    }
}
