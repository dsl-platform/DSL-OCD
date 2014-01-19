module SnowflakePropertyFromAggregateSetup
{
  aggregate OneSetOfOneMaps_6 {
    Set<Map> oneSetOfOneMaps;
  }

  snowflake OneSetOfOneMaps_6Grid from OneSetOfOneMaps_6 {
    oneSetOfOneMaps;
  }
}
