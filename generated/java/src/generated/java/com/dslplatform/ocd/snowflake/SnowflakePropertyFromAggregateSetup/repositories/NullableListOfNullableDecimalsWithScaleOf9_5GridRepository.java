package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class NullableListOfNullableDecimalsWithScaleOf9_5GridRepository
        extends
        ClientRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableListOfNullableDecimalsWithScaleOf9_5Grid> {
    public NullableListOfNullableDecimalsWithScaleOf9_5GridRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableListOfNullableDecimalsWithScaleOf9_5Grid.class,
                locator);
    }

    public NullableListOfNullableDecimalsWithScaleOf9_5GridRepository() {
        this(Bootstrap.getLocator());
    }
}
