package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class OneArrayOfNullableBinaries_6GridRepository
        extends
        ClientRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneArrayOfNullableBinaries_6Grid> {
    public OneArrayOfNullableBinaries_6GridRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneArrayOfNullableBinaries_6Grid.class,
                locator);
    }

    public OneArrayOfNullableBinaries_6GridRepository() {
        this(Bootstrap.getLocator());
    }
}
