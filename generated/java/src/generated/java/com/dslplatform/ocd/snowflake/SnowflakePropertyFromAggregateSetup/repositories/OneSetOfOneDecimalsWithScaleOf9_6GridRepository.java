package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class OneSetOfOneDecimalsWithScaleOf9_6GridRepository
        extends
        ClientRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneSetOfOneDecimalsWithScaleOf9_6Grid> {
    public OneSetOfOneDecimalsWithScaleOf9_6GridRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneSetOfOneDecimalsWithScaleOf9_6Grid.class,
                locator);
    }

    public OneSetOfOneDecimalsWithScaleOf9_6GridRepository() {
        this(Bootstrap.getLocator());
    }
}
