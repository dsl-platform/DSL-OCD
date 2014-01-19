module SnowflakePropertyFromAggregateSetup
{
  aggregate OneListOfNullableTimestamps_6 {
    List<Timestamp?> oneListOfNullableTimestamps;
  }

  snowflake OneListOfNullableTimestamps_6Grid from OneListOfNullableTimestamps_6 {
    oneListOfNullableTimestamps;
  }
}
