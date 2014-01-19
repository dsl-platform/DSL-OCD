package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class OneSetOfOneLongs_6GridRepository
        extends
        ClientRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneSetOfOneLongs_6Grid> {
    public OneSetOfOneLongs_6GridRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneSetOfOneLongs_6Grid.class,
                locator);
    }

    public OneSetOfOneLongs_6GridRepository() {
        this(Bootstrap.getLocator());
    }
}
