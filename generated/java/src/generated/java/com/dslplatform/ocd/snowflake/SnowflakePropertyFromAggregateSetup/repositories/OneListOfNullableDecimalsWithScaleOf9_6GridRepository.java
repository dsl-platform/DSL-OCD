package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class OneListOfNullableDecimalsWithScaleOf9_6GridRepository
        extends
        ClientRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneListOfNullableDecimalsWithScaleOf9_6Grid> {
    public OneListOfNullableDecimalsWithScaleOf9_6GridRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneListOfNullableDecimalsWithScaleOf9_6Grid.class,
                locator);
    }

    public OneListOfNullableDecimalsWithScaleOf9_6GridRepository() {
        this(Bootstrap.getLocator());
    }
}
