package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class OneSetOfOneStringsWithMaxLengthOf9_6GridRepository
        extends
        ClientRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneSetOfOneStringsWithMaxLengthOf9_6Grid> {
    public OneSetOfOneStringsWithMaxLengthOf9_6GridRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneSetOfOneStringsWithMaxLengthOf9_6Grid.class,
                locator);
    }

    public OneSetOfOneStringsWithMaxLengthOf9_6GridRepository() {
        this(Bootstrap.getLocator());
    }
}
