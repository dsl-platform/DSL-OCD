package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class NullableSetOfNullableDecimals_5GridRepository
        extends
        ClientRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableSetOfNullableDecimals_5Grid> {
    public NullableSetOfNullableDecimals_5GridRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableSetOfNullableDecimals_5Grid.class,
                locator);
    }

    public NullableSetOfNullableDecimals_5GridRepository() {
        this(Bootstrap.getLocator());
    }
}
