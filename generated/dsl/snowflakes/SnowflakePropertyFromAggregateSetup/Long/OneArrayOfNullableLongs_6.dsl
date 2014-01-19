module SnowflakePropertyFromAggregateSetup
{
  aggregate OneArrayOfNullableLongs_6 {
    Array<Long?> oneArrayOfNullableLongs;
  }

  snowflake OneArrayOfNullableLongs_6Grid from OneArrayOfNullableLongs_6 {
    oneArrayOfNullableLongs;
  }
}
