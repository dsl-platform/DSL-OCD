package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class OneArrayOfOneStringsWithMaxLengthOf9_6GridRepository
        extends
        ClientRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneArrayOfOneStringsWithMaxLengthOf9_6Grid> {
    public OneArrayOfOneStringsWithMaxLengthOf9_6GridRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneArrayOfOneStringsWithMaxLengthOf9_6Grid.class,
                locator);
    }

    public OneArrayOfOneStringsWithMaxLengthOf9_6GridRepository() {
        this(Bootstrap.getLocator());
    }
}
