package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class OneArrayOfNullableDecimals_6GridRepository
        extends
        ClientRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneArrayOfNullableDecimals_6Grid> {
    public OneArrayOfNullableDecimals_6GridRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneArrayOfNullableDecimals_6Grid.class,
                locator);
    }

    public OneArrayOfNullableDecimals_6GridRepository() {
        this(Bootstrap.getLocator());
    }
}
