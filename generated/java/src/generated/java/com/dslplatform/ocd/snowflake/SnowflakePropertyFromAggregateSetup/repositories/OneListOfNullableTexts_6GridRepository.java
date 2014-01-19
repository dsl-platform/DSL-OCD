package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class OneListOfNullableTexts_6GridRepository
        extends
        ClientRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneListOfNullableTexts_6Grid> {
    public OneListOfNullableTexts_6GridRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneListOfNullableTexts_6Grid.class,
                locator);
    }

    public OneListOfNullableTexts_6GridRepository() {
        this(Bootstrap.getLocator());
    }
}
