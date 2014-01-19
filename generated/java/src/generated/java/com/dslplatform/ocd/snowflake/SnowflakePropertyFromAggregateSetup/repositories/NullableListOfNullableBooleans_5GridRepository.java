package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class NullableListOfNullableBooleans_5GridRepository
        extends
        ClientRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableListOfNullableBooleans_5Grid> {
    public NullableListOfNullableBooleans_5GridRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableListOfNullableBooleans_5Grid.class,
                locator);
    }

    public NullableListOfNullableBooleans_5GridRepository() {
        this(Bootstrap.getLocator());
    }
}
