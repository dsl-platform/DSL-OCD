package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class OneDecimalWithScaleOf9_6GridRepository
        extends
        ClientRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneDecimalWithScaleOf9_6Grid> {
    public OneDecimalWithScaleOf9_6GridRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneDecimalWithScaleOf9_6Grid.class,
                locator);
    }

    public OneDecimalWithScaleOf9_6GridRepository() {
        this(Bootstrap.getLocator());
    }
}
