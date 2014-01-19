package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class NullableListOfOneStringsWithMaxLengthOf9_5GridRepository
        extends
        ClientRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableListOfOneStringsWithMaxLengthOf9_5Grid> {
    public NullableListOfOneStringsWithMaxLengthOf9_5GridRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableListOfOneStringsWithMaxLengthOf9_5Grid.class,
                locator);
    }

    public NullableListOfOneStringsWithMaxLengthOf9_5GridRepository() {
        this(Bootstrap.getLocator());
    }
}
