package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class NullableSetOfNullableStringsWithMaxLengthOf9_5GridRepository
        extends
        ClientRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableSetOfNullableStringsWithMaxLengthOf9_5Grid> {
    public NullableSetOfNullableStringsWithMaxLengthOf9_5GridRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableSetOfNullableStringsWithMaxLengthOf9_5Grid.class,
                locator);
    }

    public NullableSetOfNullableStringsWithMaxLengthOf9_5GridRepository() {
        this(Bootstrap.getLocator());
    }
}
