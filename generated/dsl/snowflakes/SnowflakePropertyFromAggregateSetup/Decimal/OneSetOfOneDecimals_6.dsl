module SnowflakePropertyFromAggregateSetup
{
  aggregate OneSetOfOneDecimals_6 {
    Set<Decimal> oneSetOfOneDecimals;
  }

  snowflake OneSetOfOneDecimals_6Grid from OneSetOfOneDecimals_6 {
    oneSetOfOneDecimals;
  }
}
