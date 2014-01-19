package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class OneArrayOfOneFloats_6GridRepository
        extends
        ClientRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneArrayOfOneFloats_6Grid> {
    public OneArrayOfOneFloats_6GridRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneArrayOfOneFloats_6Grid.class,
                locator);
    }

    public OneArrayOfOneFloats_6GridRepository() {
        this(Bootstrap.getLocator());
    }
}
