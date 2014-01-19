module SnowflakePropertyFromAggregateSetup
{
  aggregate OneArrayOfOneTimestamps_6 {
    Array<Timestamp> oneArrayOfOneTimestamps;
  }

  snowflake OneArrayOfOneTimestamps_6Grid from OneArrayOfOneTimestamps_6 {
    oneArrayOfOneTimestamps;
  }
}
