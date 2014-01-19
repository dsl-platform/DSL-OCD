package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class NullableArrayOfNullableBinaries_5GridRepository
        extends
        ClientRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableArrayOfNullableBinaries_5Grid> {
    public NullableArrayOfNullableBinaries_5GridRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableArrayOfNullableBinaries_5Grid.class,
                locator);
    }

    public NullableArrayOfNullableBinaries_5GridRepository() {
        this(Bootstrap.getLocator());
    }
}
