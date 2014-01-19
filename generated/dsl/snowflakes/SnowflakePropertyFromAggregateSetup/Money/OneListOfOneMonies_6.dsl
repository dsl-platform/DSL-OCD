module SnowflakePropertyFromAggregateSetup
{
  aggregate OneListOfOneMonies_6 {
    List<Money> oneListOfOneMonies;
  }

  snowflake OneListOfOneMonies_6Grid from OneListOfOneMonies_6 {
    oneListOfOneMonies;
  }
}
