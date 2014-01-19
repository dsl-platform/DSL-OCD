package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class NullableListOfOneDecimalsWithScaleOf9_5GridRepository
        extends
        ClientRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableListOfOneDecimalsWithScaleOf9_5Grid> {
    public NullableListOfOneDecimalsWithScaleOf9_5GridRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableListOfOneDecimalsWithScaleOf9_5Grid.class,
                locator);
    }

    public NullableListOfOneDecimalsWithScaleOf9_5GridRepository() {
        this(Bootstrap.getLocator());
    }
}
