module SnowflakePropertyFromAggregateSetup
{
  aggregate OneSetOfNullableTimestamps_6 {
    Set<Timestamp?> oneSetOfNullableTimestamps;
  }

  snowflake OneSetOfNullableTimestamps_6Grid from OneSetOfNullableTimestamps_6 {
    oneSetOfNullableTimestamps;
  }
}
