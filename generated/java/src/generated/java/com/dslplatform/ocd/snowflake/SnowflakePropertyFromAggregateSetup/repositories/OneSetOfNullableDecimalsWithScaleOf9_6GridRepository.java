package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class OneSetOfNullableDecimalsWithScaleOf9_6GridRepository
        extends
        ClientRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneSetOfNullableDecimalsWithScaleOf9_6Grid> {
    public OneSetOfNullableDecimalsWithScaleOf9_6GridRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneSetOfNullableDecimalsWithScaleOf9_6Grid.class,
                locator);
    }

    public OneSetOfNullableDecimalsWithScaleOf9_6GridRepository() {
        this(Bootstrap.getLocator());
    }
}
