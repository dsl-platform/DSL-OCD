package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class OneArrayOfOneBinaries_6GridRepository
        extends
        ClientRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneArrayOfOneBinaries_6Grid> {
    public OneArrayOfOneBinaries_6GridRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneArrayOfOneBinaries_6Grid.class,
                locator);
    }

    public OneArrayOfOneBinaries_6GridRepository() {
        this(Bootstrap.getLocator());
    }
}
