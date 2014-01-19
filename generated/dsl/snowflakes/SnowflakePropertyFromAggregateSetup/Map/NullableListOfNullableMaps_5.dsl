module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableListOfNullableMaps_5 {
    List<Map?>? nullableListOfNullableMaps;
  }

  snowflake NullableListOfNullableMaps_5Grid from NullableListOfNullableMaps_5 {
    nullableListOfNullableMaps;
  }
}
