module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableSetOfOneMaps_5 {
    Set<Map>? nullableSetOfOneMaps;
  }

  snowflake NullableSetOfOneMaps_5Grid from NullableSetOfOneMaps_5 {
    nullableSetOfOneMaps;
  }
}
