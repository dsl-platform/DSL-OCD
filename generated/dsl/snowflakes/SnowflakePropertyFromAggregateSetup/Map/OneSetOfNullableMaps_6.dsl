module SnowflakePropertyFromAggregateSetup
{
  aggregate OneSetOfNullableMaps_6 {
    Set<Map?> oneSetOfNullableMaps;
  }

  snowflake OneSetOfNullableMaps_6Grid from OneSetOfNullableMaps_6 {
    oneSetOfNullableMaps;
  }
}
