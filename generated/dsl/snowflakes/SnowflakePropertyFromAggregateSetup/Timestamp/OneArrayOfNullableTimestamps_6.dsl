module SnowflakePropertyFromAggregateSetup
{
  aggregate OneArrayOfNullableTimestamps_6 {
    Array<Timestamp?> oneArrayOfNullableTimestamps;
  }

  snowflake OneArrayOfNullableTimestamps_6Grid from OneArrayOfNullableTimestamps_6 {
    oneArrayOfNullableTimestamps;
  }
}
