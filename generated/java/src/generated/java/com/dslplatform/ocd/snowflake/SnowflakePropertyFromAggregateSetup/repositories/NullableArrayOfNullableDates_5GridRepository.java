package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class NullableArrayOfNullableDates_5GridRepository
        extends
        ClientRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableArrayOfNullableDates_5Grid> {
    public NullableArrayOfNullableDates_5GridRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableArrayOfNullableDates_5Grid.class,
                locator);
    }

    public NullableArrayOfNullableDates_5GridRepository() {
        this(Bootstrap.getLocator());
    }
}
