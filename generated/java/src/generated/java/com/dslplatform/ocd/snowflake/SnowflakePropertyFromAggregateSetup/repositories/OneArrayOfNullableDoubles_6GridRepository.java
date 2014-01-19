package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class OneArrayOfNullableDoubles_6GridRepository
        extends
        ClientRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneArrayOfNullableDoubles_6Grid> {
    public OneArrayOfNullableDoubles_6GridRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneArrayOfNullableDoubles_6Grid.class,
                locator);
    }

    public OneArrayOfNullableDoubles_6GridRepository() {
        this(Bootstrap.getLocator());
    }
}
