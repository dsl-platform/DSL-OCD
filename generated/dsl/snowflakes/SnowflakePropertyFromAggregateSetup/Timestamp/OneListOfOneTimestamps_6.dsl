module SnowflakePropertyFromAggregateSetup
{
  aggregate OneListOfOneTimestamps_6 {
    List<Timestamp> oneListOfOneTimestamps;
  }

  snowflake OneListOfOneTimestamps_6Grid from OneListOfOneTimestamps_6 {
    oneListOfOneTimestamps;
  }
}
