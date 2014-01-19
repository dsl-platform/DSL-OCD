package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class OneListOfNullableStringsWithMaxLengthOf9_6GridRepository
        extends
        ClientRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneListOfNullableStringsWithMaxLengthOf9_6Grid> {
    public OneListOfNullableStringsWithMaxLengthOf9_6GridRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneListOfNullableStringsWithMaxLengthOf9_6Grid.class,
                locator);
    }

    public OneListOfNullableStringsWithMaxLengthOf9_6GridRepository() {
        this(Bootstrap.getLocator());
    }
}
