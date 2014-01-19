package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class NullableArrayOfOneDecimalsWithScaleOf9_5GridRepository
        extends
        ClientRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableArrayOfOneDecimalsWithScaleOf9_5Grid> {
    public NullableArrayOfOneDecimalsWithScaleOf9_5GridRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableArrayOfOneDecimalsWithScaleOf9_5Grid.class,
                locator);
    }

    public NullableArrayOfOneDecimalsWithScaleOf9_5GridRepository() {
        this(Bootstrap.getLocator());
    }
}
