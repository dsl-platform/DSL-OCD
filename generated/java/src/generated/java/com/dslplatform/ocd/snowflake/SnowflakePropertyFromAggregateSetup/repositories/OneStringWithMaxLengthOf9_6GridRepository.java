package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class OneStringWithMaxLengthOf9_6GridRepository
        extends
        ClientRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneStringWithMaxLengthOf9_6Grid> {
    public OneStringWithMaxLengthOf9_6GridRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneStringWithMaxLengthOf9_6Grid.class,
                locator);
    }

    public OneStringWithMaxLengthOf9_6GridRepository() {
        this(Bootstrap.getLocator());
    }
}
