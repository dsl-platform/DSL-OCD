package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class OneArrayOfNullableDecimalsWithScaleOf9_6GridRepository
        extends
        ClientRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneArrayOfNullableDecimalsWithScaleOf9_6Grid> {
    public OneArrayOfNullableDecimalsWithScaleOf9_6GridRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneArrayOfNullableDecimalsWithScaleOf9_6Grid.class,
                locator);
    }

    public OneArrayOfNullableDecimalsWithScaleOf9_6GridRepository() {
        this(Bootstrap.getLocator());
    }
}
