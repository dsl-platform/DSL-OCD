package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class OneSetOfNullableMaps_6GridRepository
        extends
        ClientRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneSetOfNullableMaps_6Grid> {
    public OneSetOfNullableMaps_6GridRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneSetOfNullableMaps_6Grid.class,
                locator);
    }

    public OneSetOfNullableMaps_6GridRepository() {
        this(Bootstrap.getLocator());
    }
}
