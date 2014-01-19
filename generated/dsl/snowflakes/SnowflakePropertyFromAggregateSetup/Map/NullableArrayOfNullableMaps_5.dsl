module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableArrayOfNullableMaps_5 {
    Array<Map?>? nullableArrayOfNullableMaps;
  }

  snowflake NullableArrayOfNullableMaps_5Grid from NullableArrayOfNullableMaps_5 {
    nullableArrayOfNullableMaps;
  }
}
