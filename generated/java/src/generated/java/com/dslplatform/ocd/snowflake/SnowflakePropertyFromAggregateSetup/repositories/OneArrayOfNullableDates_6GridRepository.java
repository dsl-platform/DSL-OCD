package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class OneArrayOfNullableDates_6GridRepository
        extends
        ClientRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneArrayOfNullableDates_6Grid> {
    public OneArrayOfNullableDates_6GridRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneArrayOfNullableDates_6Grid.class,
                locator);
    }

    public OneArrayOfNullableDates_6GridRepository() {
        this(Bootstrap.getLocator());
    }
}
