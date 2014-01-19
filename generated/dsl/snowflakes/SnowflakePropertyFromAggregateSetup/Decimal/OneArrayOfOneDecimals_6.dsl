module SnowflakePropertyFromAggregateSetup
{
  aggregate OneArrayOfOneDecimals_6 {
    Array<Decimal> oneArrayOfOneDecimals;
  }

  snowflake OneArrayOfOneDecimals_6Grid from OneArrayOfOneDecimals_6 {
    oneArrayOfOneDecimals;
  }
}
