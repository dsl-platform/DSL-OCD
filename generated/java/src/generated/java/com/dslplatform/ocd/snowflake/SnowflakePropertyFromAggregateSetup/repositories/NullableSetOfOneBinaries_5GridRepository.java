package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class NullableSetOfOneBinaries_5GridRepository
        extends
        ClientRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableSetOfOneBinaries_5Grid> {
    public NullableSetOfOneBinaries_5GridRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableSetOfOneBinaries_5Grid.class,
                locator);
    }

    public NullableSetOfOneBinaries_5GridRepository() {
        this(Bootstrap.getLocator());
    }
}
