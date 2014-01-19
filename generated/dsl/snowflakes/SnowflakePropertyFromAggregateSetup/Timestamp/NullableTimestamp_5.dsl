module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableTimestamp_5 {
    Timestamp? nullableTimestamp;
  }

  snowflake NullableTimestamp_5Grid from NullableTimestamp_5 {
    nullableTimestamp;
  }
}
