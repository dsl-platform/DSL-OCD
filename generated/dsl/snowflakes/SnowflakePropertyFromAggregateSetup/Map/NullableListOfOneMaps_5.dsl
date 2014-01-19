module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableListOfOneMaps_5 {
    List<Map>? nullableListOfOneMaps;
  }

  snowflake NullableListOfOneMaps_5Grid from NullableListOfOneMaps_5 {
    nullableListOfOneMaps;
  }
}
