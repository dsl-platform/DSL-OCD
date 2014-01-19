package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class OneArrayOfNullableFloats_6GridRepository
        extends
        ClientRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneArrayOfNullableFloats_6Grid> {
    public OneArrayOfNullableFloats_6GridRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneArrayOfNullableFloats_6Grid.class,
                locator);
    }

    public OneArrayOfNullableFloats_6GridRepository() {
        this(Bootstrap.getLocator());
    }
}
