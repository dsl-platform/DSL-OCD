module SnowflakePropertyFromAggregateSetup
{
  aggregate OneArrayOfOneMaps_6 {
    Array<Map> oneArrayOfOneMaps;
  }

  snowflake OneArrayOfOneMaps_6Grid from OneArrayOfOneMaps_6 {
    oneArrayOfOneMaps;
  }
}
