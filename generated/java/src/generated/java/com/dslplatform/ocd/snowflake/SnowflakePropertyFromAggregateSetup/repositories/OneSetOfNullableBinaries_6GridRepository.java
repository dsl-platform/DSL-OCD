package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class OneSetOfNullableBinaries_6GridRepository
        extends
        ClientRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneSetOfNullableBinaries_6Grid> {
    public OneSetOfNullableBinaries_6GridRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneSetOfNullableBinaries_6Grid.class,
                locator);
    }

    public OneSetOfNullableBinaries_6GridRepository() {
        this(Bootstrap.getLocator());
    }
}
