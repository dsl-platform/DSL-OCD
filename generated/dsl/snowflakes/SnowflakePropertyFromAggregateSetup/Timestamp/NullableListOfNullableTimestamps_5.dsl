module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableListOfNullableTimestamps_5 {
    List<Timestamp?>? nullableListOfNullableTimestamps;
  }

  snowflake NullableListOfNullableTimestamps_5Grid from NullableListOfNullableTimestamps_5 {
    nullableListOfNullableTimestamps;
  }
}
