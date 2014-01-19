package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class NullableListOfNullablePoints_5GridRepository
        extends
        ClientRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableListOfNullablePoints_5Grid> {
    public NullableListOfNullablePoints_5GridRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableListOfNullablePoints_5Grid.class,
                locator);
    }

    public NullableListOfNullablePoints_5GridRepository() {
        this(Bootstrap.getLocator());
    }
}
