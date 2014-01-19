package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class OneArrayOfOneDecimalsWithScaleOf9_6Repository
        extends
        ClientPersistableRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneArrayOfOneDecimalsWithScaleOf9_6> {
    public OneArrayOfOneDecimalsWithScaleOf9_6Repository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneArrayOfOneDecimalsWithScaleOf9_6.class,
                locator);
    }
}
