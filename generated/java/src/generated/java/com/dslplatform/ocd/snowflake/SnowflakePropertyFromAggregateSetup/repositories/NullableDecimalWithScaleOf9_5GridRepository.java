package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class NullableDecimalWithScaleOf9_5GridRepository
        extends
        ClientRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableDecimalWithScaleOf9_5Grid> {
    public NullableDecimalWithScaleOf9_5GridRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableDecimalWithScaleOf9_5Grid.class,
                locator);
    }

    public NullableDecimalWithScaleOf9_5GridRepository() {
        this(Bootstrap.getLocator());
    }
}
