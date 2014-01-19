module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableSetOfNullableMaps_5 {
    Set<Map?>? nullableSetOfNullableMaps;
  }

  snowflake NullableSetOfNullableMaps_5Grid from NullableSetOfNullableMaps_5 {
    nullableSetOfNullableMaps;
  }
}
