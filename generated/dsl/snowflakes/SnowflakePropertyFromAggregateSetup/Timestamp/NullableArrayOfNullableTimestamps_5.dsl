module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableArrayOfNullableTimestamps_5 {
    Array<Timestamp?>? nullableArrayOfNullableTimestamps;
  }

  snowflake NullableArrayOfNullableTimestamps_5Grid from NullableArrayOfNullableTimestamps_5 {
    nullableArrayOfNullableTimestamps;
  }
}
