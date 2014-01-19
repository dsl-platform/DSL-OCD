package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class NullableArrayOfNullableLocations_5GridRepository
        extends
        ClientRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableArrayOfNullableLocations_5Grid> {
    public NullableArrayOfNullableLocations_5GridRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableArrayOfNullableLocations_5Grid.class,
                locator);
    }

    public NullableArrayOfNullableLocations_5GridRepository() {
        this(Bootstrap.getLocator());
    }
}
