module SnowflakePropertyFromAggregateSetup
{
  aggregate OneSetOfNullableLongs_6 {
    Set<Long?> oneSetOfNullableLongs;
  }

  snowflake OneSetOfNullableLongs_6Grid from OneSetOfNullableLongs_6 {
    oneSetOfNullableLongs;
  }
}
