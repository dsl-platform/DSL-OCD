package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class OneArrayOfOneMonies_6GridRepository
        extends
        ClientRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneArrayOfOneMonies_6Grid> {
    public OneArrayOfOneMonies_6GridRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneArrayOfOneMonies_6Grid.class,
                locator);
    }

    public OneArrayOfOneMonies_6GridRepository() {
        this(Bootstrap.getLocator());
    }
}
