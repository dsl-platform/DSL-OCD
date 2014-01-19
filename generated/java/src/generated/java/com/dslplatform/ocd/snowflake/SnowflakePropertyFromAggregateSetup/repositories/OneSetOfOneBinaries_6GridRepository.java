package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class OneSetOfOneBinaries_6GridRepository
        extends
        ClientRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneSetOfOneBinaries_6Grid> {
    public OneSetOfOneBinaries_6GridRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneSetOfOneBinaries_6Grid.class,
                locator);
    }

    public OneSetOfOneBinaries_6GridRepository() {
        this(Bootstrap.getLocator());
    }
}
