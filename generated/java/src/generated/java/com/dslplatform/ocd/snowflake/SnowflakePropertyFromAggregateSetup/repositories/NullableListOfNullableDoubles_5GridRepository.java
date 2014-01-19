package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class NullableListOfNullableDoubles_5GridRepository
        extends
        ClientRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableListOfNullableDoubles_5Grid> {
    public NullableListOfNullableDoubles_5GridRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableListOfNullableDoubles_5Grid.class,
                locator);
    }

    public NullableListOfNullableDoubles_5GridRepository() {
        this(Bootstrap.getLocator());
    }
}
