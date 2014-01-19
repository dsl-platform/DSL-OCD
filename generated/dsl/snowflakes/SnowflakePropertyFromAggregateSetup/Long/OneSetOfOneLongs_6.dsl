module SnowflakePropertyFromAggregateSetup
{
  aggregate OneSetOfOneLongs_6 {
    Set<Long> oneSetOfOneLongs;
  }

  snowflake OneSetOfOneLongs_6Grid from OneSetOfOneLongs_6 {
    oneSetOfOneLongs;
  }
}
