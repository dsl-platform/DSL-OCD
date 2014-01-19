package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class OneArrayOfOneGuids_6GridRepository
        extends
        ClientRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneArrayOfOneGuids_6Grid> {
    public OneArrayOfOneGuids_6GridRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneArrayOfOneGuids_6Grid.class,
                locator);
    }

    public OneArrayOfOneGuids_6GridRepository() {
        this(Bootstrap.getLocator());
    }
}
