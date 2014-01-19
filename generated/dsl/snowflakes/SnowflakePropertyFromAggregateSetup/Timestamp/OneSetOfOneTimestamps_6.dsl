module SnowflakePropertyFromAggregateSetup
{
  aggregate OneSetOfOneTimestamps_6 {
    Set<Timestamp> oneSetOfOneTimestamps;
  }

  snowflake OneSetOfOneTimestamps_6Grid from OneSetOfOneTimestamps_6 {
    oneSetOfOneTimestamps;
  }
}
