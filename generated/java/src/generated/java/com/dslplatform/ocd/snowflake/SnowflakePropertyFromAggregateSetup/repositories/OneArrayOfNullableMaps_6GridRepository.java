package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class OneArrayOfNullableMaps_6GridRepository
        extends
        ClientRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneArrayOfNullableMaps_6Grid> {
    public OneArrayOfNullableMaps_6GridRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneArrayOfNullableMaps_6Grid.class,
                locator);
    }

    public OneArrayOfNullableMaps_6GridRepository() {
        this(Bootstrap.getLocator());
    }
}
