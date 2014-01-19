package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class NullableArrayOfOneLocations_5GridRepository
        extends
        ClientRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableArrayOfOneLocations_5Grid> {
    public NullableArrayOfOneLocations_5GridRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableArrayOfOneLocations_5Grid.class,
                locator);
    }

    public NullableArrayOfOneLocations_5GridRepository() {
        this(Bootstrap.getLocator());
    }
}
