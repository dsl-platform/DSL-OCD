package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class NullableArrayOfNullableDecimalsWithScaleOf9_5GridRepository
        extends
        ClientRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableArrayOfNullableDecimalsWithScaleOf9_5Grid> {
    public NullableArrayOfNullableDecimalsWithScaleOf9_5GridRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableArrayOfNullableDecimalsWithScaleOf9_5Grid.class,
                locator);
    }

    public NullableArrayOfNullableDecimalsWithScaleOf9_5GridRepository() {
        this(Bootstrap.getLocator());
    }
}
