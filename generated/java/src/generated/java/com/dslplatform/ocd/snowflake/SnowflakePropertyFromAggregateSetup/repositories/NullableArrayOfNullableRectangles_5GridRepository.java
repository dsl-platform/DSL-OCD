package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class NullableArrayOfNullableRectangles_5GridRepository
        extends
        ClientRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableArrayOfNullableRectangles_5Grid> {
    public NullableArrayOfNullableRectangles_5GridRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableArrayOfNullableRectangles_5Grid.class,
                locator);
    }

    public NullableArrayOfNullableRectangles_5GridRepository() {
        this(Bootstrap.getLocator());
    }
}
