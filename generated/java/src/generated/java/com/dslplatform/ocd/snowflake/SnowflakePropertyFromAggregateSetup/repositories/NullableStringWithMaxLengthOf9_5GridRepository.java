package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class NullableStringWithMaxLengthOf9_5GridRepository
        extends
        ClientRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableStringWithMaxLengthOf9_5Grid> {
    public NullableStringWithMaxLengthOf9_5GridRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableStringWithMaxLengthOf9_5Grid.class,
                locator);
    }

    public NullableStringWithMaxLengthOf9_5GridRepository() {
        this(Bootstrap.getLocator());
    }
}
