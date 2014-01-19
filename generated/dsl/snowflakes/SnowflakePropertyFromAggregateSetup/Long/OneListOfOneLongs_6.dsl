module SnowflakePropertyFromAggregateSetup
{
  aggregate OneListOfOneLongs_6 {
    List<Long> oneListOfOneLongs;
  }

  snowflake OneListOfOneLongs_6Grid from OneListOfOneLongs_6 {
    oneListOfOneLongs;
  }
}
