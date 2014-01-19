package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class NullableArrayOfNullableDoubles_5GridRepository
        extends
        ClientRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableArrayOfNullableDoubles_5Grid> {
    public NullableArrayOfNullableDoubles_5GridRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableArrayOfNullableDoubles_5Grid.class,
                locator);
    }

    public NullableArrayOfNullableDoubles_5GridRepository() {
        this(Bootstrap.getLocator());
    }
}
