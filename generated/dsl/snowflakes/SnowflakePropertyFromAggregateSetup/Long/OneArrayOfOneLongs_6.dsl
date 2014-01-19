module SnowflakePropertyFromAggregateSetup
{
  aggregate OneArrayOfOneLongs_6 {
    Array<Long> oneArrayOfOneLongs;
  }

  snowflake OneArrayOfOneLongs_6Grid from OneArrayOfOneLongs_6 {
    oneArrayOfOneLongs;
  }
}
