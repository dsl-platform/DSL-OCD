package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class NullableSetOfOneStringsWithMaxLengthOf9_5GridRepository
        extends
        ClientRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableSetOfOneStringsWithMaxLengthOf9_5Grid> {
    public NullableSetOfOneStringsWithMaxLengthOf9_5GridRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableSetOfOneStringsWithMaxLengthOf9_5Grid.class,
                locator);
    }

    public NullableSetOfOneStringsWithMaxLengthOf9_5GridRepository() {
        this(Bootstrap.getLocator());
    }
}
