package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class NullableSetOfOneDecimalsWithScaleOf9_5GridRepository
        extends
        ClientRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableSetOfOneDecimalsWithScaleOf9_5Grid> {
    public NullableSetOfOneDecimalsWithScaleOf9_5GridRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableSetOfOneDecimalsWithScaleOf9_5Grid.class,
                locator);
    }

    public NullableSetOfOneDecimalsWithScaleOf9_5GridRepository() {
        this(Bootstrap.getLocator());
    }
}
