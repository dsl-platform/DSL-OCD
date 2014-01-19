module SnowflakePropertyFromAggregateSetup
{
  aggregate OneListOfOneMaps_6 {
    List<Map> oneListOfOneMaps;
  }

  snowflake OneListOfOneMaps_6Grid from OneListOfOneMaps_6 {
    oneListOfOneMaps;
  }
}
