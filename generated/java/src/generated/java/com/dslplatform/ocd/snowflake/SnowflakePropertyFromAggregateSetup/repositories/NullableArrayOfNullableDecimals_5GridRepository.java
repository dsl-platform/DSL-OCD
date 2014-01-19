package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class NullableArrayOfNullableDecimals_5GridRepository
        extends
        ClientRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableArrayOfNullableDecimals_5Grid> {
    public NullableArrayOfNullableDecimals_5GridRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableArrayOfNullableDecimals_5Grid.class,
                locator);
    }

    public NullableArrayOfNullableDecimals_5GridRepository() {
        this(Bootstrap.getLocator());
    }
}
