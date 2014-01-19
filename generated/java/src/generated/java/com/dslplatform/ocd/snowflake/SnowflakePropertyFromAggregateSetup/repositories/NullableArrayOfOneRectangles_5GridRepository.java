package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class NullableArrayOfOneRectangles_5GridRepository
        extends
        ClientRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableArrayOfOneRectangles_5Grid> {
    public NullableArrayOfOneRectangles_5GridRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableArrayOfOneRectangles_5Grid.class,
                locator);
    }

    public NullableArrayOfOneRectangles_5GridRepository() {
        this(Bootstrap.getLocator());
    }
}
