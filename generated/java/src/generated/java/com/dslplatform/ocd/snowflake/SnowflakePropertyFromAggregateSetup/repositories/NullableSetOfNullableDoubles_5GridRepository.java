package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class NullableSetOfNullableDoubles_5GridRepository
        extends
        ClientRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableSetOfNullableDoubles_5Grid> {
    public NullableSetOfNullableDoubles_5GridRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableSetOfNullableDoubles_5Grid.class,
                locator);
    }

    public NullableSetOfNullableDoubles_5GridRepository() {
        this(Bootstrap.getLocator());
    }
}
