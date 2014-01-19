module SnowflakePropertyFromAggregateSetup
{
  aggregate OneSetOfOneMonies_6 {
    Set<Money> oneSetOfOneMonies;
  }

  snowflake OneSetOfOneMonies_6Grid from OneSetOfOneMonies_6 {
    oneSetOfOneMonies;
  }
}
