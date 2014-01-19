package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class NullableArrayOfNullablePoints_5GridRepository
        extends
        ClientRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableArrayOfNullablePoints_5Grid> {
    public NullableArrayOfNullablePoints_5GridRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableArrayOfNullablePoints_5Grid.class,
                locator);
    }

    public NullableArrayOfNullablePoints_5GridRepository() {
        this(Bootstrap.getLocator());
    }
}
