package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class OneArrayOfOneDecimalsWithScaleOf9_6GridRepository
        extends
        ClientRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneArrayOfOneDecimalsWithScaleOf9_6Grid> {
    public OneArrayOfOneDecimalsWithScaleOf9_6GridRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneArrayOfOneDecimalsWithScaleOf9_6Grid.class,
                locator);
    }

    public OneArrayOfOneDecimalsWithScaleOf9_6GridRepository() {
        this(Bootstrap.getLocator());
    }
}
