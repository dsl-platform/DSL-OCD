package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class NullableSetOfNullablePoints_5GridRepository
        extends
        ClientRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableSetOfNullablePoints_5Grid> {
    public NullableSetOfNullablePoints_5GridRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableSetOfNullablePoints_5Grid.class,
                locator);
    }

    public NullableSetOfNullablePoints_5GridRepository() {
        this(Bootstrap.getLocator());
    }
}
