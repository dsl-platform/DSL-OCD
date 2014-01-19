package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class OneSetOfOneTexts_6GridRepository
        extends
        ClientRepository<com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneSetOfOneTexts_6Grid> {
    public OneSetOfOneTexts_6GridRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneSetOfOneTexts_6Grid.class,
                locator);
    }

    public OneSetOfOneTexts_6GridRepository() {
        this(Bootstrap.getLocator());
    }
}
