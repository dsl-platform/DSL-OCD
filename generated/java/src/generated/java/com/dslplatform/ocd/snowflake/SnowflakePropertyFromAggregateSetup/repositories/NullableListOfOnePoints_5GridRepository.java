package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class NullableListOfOnePoints_5GridRepository
        extends
        ClientRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableListOfOnePoints_5Grid> {
    public NullableListOfOnePoints_5GridRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableListOfOnePoints_5Grid.class,
                locator);
    }

    public NullableListOfOnePoints_5GridRepository() {
        this(Bootstrap.getLocator());
    }
}
