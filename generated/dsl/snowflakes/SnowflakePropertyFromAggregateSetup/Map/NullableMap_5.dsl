module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableMap_5 {
    Map? nullableMap;
  }

  snowflake NullableMap_5Grid from NullableMap_5 {
    nullableMap;
  }
}
