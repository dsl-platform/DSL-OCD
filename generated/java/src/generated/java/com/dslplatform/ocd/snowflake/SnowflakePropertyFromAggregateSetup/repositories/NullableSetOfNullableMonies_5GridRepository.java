package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class NullableSetOfNullableMonies_5GridRepository
        extends
        ClientRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableSetOfNullableMonies_5Grid> {
    public NullableSetOfNullableMonies_5GridRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableSetOfNullableMonies_5Grid.class,
                locator);
    }

    public NullableSetOfNullableMonies_5GridRepository() {
        this(Bootstrap.getLocator());
    }
}
