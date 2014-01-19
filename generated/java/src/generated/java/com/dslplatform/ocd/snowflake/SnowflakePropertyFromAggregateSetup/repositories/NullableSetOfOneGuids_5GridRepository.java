package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class NullableSetOfOneGuids_5GridRepository
        extends
        ClientRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableSetOfOneGuids_5Grid> {
    public NullableSetOfOneGuids_5GridRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableSetOfOneGuids_5Grid.class,
                locator);
    }

    public NullableSetOfOneGuids_5GridRepository() {
        this(Bootstrap.getLocator());
    }
}
