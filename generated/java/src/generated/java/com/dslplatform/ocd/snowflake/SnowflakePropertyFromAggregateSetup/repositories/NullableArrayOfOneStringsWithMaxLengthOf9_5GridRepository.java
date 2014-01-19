package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class NullableArrayOfOneStringsWithMaxLengthOf9_5GridRepository
        extends
        ClientRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableArrayOfOneStringsWithMaxLengthOf9_5Grid> {
    public NullableArrayOfOneStringsWithMaxLengthOf9_5GridRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableArrayOfOneStringsWithMaxLengthOf9_5Grid.class,
                locator);
    }

    public NullableArrayOfOneStringsWithMaxLengthOf9_5GridRepository() {
        this(Bootstrap.getLocator());
    }
}
