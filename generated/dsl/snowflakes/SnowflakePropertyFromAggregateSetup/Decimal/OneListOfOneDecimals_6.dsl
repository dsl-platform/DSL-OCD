module SnowflakePropertyFromAggregateSetup
{
  aggregate OneListOfOneDecimals_6 {
    List<Decimal> oneListOfOneDecimals;
  }

  snowflake OneListOfOneDecimals_6Grid from OneListOfOneDecimals_6 {
    oneListOfOneDecimals;
  }
}
