package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class OneListOfOneDecimalsWithScaleOf9_6GridRepository
        extends
        ClientRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneListOfOneDecimalsWithScaleOf9_6Grid> {
    public OneListOfOneDecimalsWithScaleOf9_6GridRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneListOfOneDecimalsWithScaleOf9_6Grid.class,
                locator);
    }

    public OneListOfOneDecimalsWithScaleOf9_6GridRepository() {
        this(Bootstrap.getLocator());
    }
}
