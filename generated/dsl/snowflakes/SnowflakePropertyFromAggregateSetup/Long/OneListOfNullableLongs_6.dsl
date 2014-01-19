module SnowflakePropertyFromAggregateSetup
{
  aggregate OneListOfNullableLongs_6 {
    List<Long?> oneListOfNullableLongs;
  }

  snowflake OneListOfNullableLongs_6Grid from OneListOfNullableLongs_6 {
    oneListOfNullableLongs;
  }
}
