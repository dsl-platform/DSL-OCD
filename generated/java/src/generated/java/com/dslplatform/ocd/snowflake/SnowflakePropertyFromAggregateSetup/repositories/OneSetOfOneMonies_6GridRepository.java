package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class OneSetOfOneMonies_6GridRepository
        extends
        ClientRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneSetOfOneMonies_6Grid> {
    public OneSetOfOneMonies_6GridRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneSetOfOneMonies_6Grid.class,
                locator);
    }

    public OneSetOfOneMonies_6GridRepository() {
        this(Bootstrap.getLocator());
    }
}
