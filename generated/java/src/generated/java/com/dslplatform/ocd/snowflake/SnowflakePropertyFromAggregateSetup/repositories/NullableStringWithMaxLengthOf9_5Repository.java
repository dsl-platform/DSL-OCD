package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class NullableStringWithMaxLengthOf9_5Repository
        extends
        ClientPersistableRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableStringWithMaxLengthOf9_5> {
    public NullableStringWithMaxLengthOf9_5Repository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableStringWithMaxLengthOf9_5.class,
                locator);
    }
}
