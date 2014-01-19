package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class NullableSetOfNullableFloats_5GridRepository
        extends
        ClientRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableSetOfNullableFloats_5Grid> {
    public NullableSetOfNullableFloats_5GridRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableSetOfNullableFloats_5Grid.class,
                locator);
    }

    public NullableSetOfNullableFloats_5GridRepository() {
        this(Bootstrap.getLocator());
    }
}
