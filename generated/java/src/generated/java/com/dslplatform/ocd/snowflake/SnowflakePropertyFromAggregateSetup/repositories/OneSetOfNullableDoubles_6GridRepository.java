package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class OneSetOfNullableDoubles_6GridRepository
        extends
        ClientRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneSetOfNullableDoubles_6Grid> {
    public OneSetOfNullableDoubles_6GridRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneSetOfNullableDoubles_6Grid.class,
                locator);
    }

    public OneSetOfNullableDoubles_6GridRepository() {
        this(Bootstrap.getLocator());
    }
}
