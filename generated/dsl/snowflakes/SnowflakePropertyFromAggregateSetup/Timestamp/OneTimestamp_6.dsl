module SnowflakePropertyFromAggregateSetup
{
  aggregate OneTimestamp_6 {
    Timestamp oneTimestamp;
  }

  snowflake OneTimestamp_6Grid from OneTimestamp_6 {
    oneTimestamp;
  }
}
