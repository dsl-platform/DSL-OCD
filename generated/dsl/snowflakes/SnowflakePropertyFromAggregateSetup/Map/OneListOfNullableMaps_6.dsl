module SnowflakePropertyFromAggregateSetup
{
  aggregate OneListOfNullableMaps_6 {
    List<Map?> oneListOfNullableMaps;
  }

  snowflake OneListOfNullableMaps_6Grid from OneListOfNullableMaps_6 {
    oneListOfNullableMaps;
  }
}
