package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class OneSetOfNullableStringsWithMaxLengthOf9_6Repository
        extends
        ClientPersistableRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneSetOfNullableStringsWithMaxLengthOf9_6> {
    public OneSetOfNullableStringsWithMaxLengthOf9_6Repository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneSetOfNullableStringsWithMaxLengthOf9_6.class,
                locator);
    }
}
