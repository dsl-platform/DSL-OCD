package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class NullableSetOfNullableBooleans_5GridRepository
        extends
        ClientRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableSetOfNullableBooleans_5Grid> {
    public NullableSetOfNullableBooleans_5GridRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableSetOfNullableBooleans_5Grid.class,
                locator);
    }

    public NullableSetOfNullableBooleans_5GridRepository() {
        this(Bootstrap.getLocator());
    }
}
