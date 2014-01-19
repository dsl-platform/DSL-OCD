package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class NullableSetOfNullableDecimalsWithScaleOf9_5GridRepository
        extends
        ClientRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableSetOfNullableDecimalsWithScaleOf9_5Grid> {
    public NullableSetOfNullableDecimalsWithScaleOf9_5GridRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableSetOfNullableDecimalsWithScaleOf9_5Grid.class,
                locator);
    }

    public NullableSetOfNullableDecimalsWithScaleOf9_5GridRepository() {
        this(Bootstrap.getLocator());
    }
}
