package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class OneListOfOneStringsWithMaxLengthOf9_6GridRepository
        extends
        ClientRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneListOfOneStringsWithMaxLengthOf9_6Grid> {
    public OneListOfOneStringsWithMaxLengthOf9_6GridRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneListOfOneStringsWithMaxLengthOf9_6Grid.class,
                locator);
    }

    public OneListOfOneStringsWithMaxLengthOf9_6GridRepository() {
        this(Bootstrap.getLocator());
    }
}
