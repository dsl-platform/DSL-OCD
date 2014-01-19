package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class NullableListOfNullableStringsWithMaxLengthOf9_5GridRepository
        extends
        ClientRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableListOfNullableStringsWithMaxLengthOf9_5Grid> {
    public NullableListOfNullableStringsWithMaxLengthOf9_5GridRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableListOfNullableStringsWithMaxLengthOf9_5Grid.class,
                locator);
    }

    public NullableListOfNullableStringsWithMaxLengthOf9_5GridRepository() {
        this(Bootstrap.getLocator());
    }
}
