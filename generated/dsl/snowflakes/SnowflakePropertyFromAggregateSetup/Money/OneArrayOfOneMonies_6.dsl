module SnowflakePropertyFromAggregateSetup
{
  aggregate OneArrayOfOneMonies_6 {
    Array<Money> oneArrayOfOneMonies;
  }

  snowflake OneArrayOfOneMonies_6Grid from OneArrayOfOneMonies_6 {
    oneArrayOfOneMonies;
  }
}
