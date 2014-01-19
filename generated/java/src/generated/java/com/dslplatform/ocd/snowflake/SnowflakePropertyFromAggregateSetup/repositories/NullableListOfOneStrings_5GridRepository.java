package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class NullableListOfOneStrings_5GridRepository
        extends
        ClientRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableListOfOneStrings_5Grid> {
    public NullableListOfOneStrings_5GridRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableListOfOneStrings_5Grid.class,
                locator);
    }

    public NullableListOfOneStrings_5GridRepository() {
        this(Bootstrap.getLocator());
    }
}
