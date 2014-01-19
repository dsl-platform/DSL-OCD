module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableSetOfNullableTimestamps_5 {
    Set<Timestamp?>? nullableSetOfNullableTimestamps;
  }

  snowflake NullableSetOfNullableTimestamps_5Grid from NullableSetOfNullableTimestamps_5 {
    nullableSetOfNullableTimestamps;
  }
}
