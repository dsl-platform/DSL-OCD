package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class OneArrayOfNullableStringsWithMaxLengthOf9_6GridRepository
        extends
        ClientRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneArrayOfNullableStringsWithMaxLengthOf9_6Grid> {
    public OneArrayOfNullableStringsWithMaxLengthOf9_6GridRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneArrayOfNullableStringsWithMaxLengthOf9_6Grid.class,
                locator);
    }

    public OneArrayOfNullableStringsWithMaxLengthOf9_6GridRepository() {
        this(Bootstrap.getLocator());
    }
}
