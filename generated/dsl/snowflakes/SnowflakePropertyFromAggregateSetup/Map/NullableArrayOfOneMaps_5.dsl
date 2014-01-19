module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableArrayOfOneMaps_5 {
    Array<Map>? nullableArrayOfOneMaps;
  }

  snowflake NullableArrayOfOneMaps_5Grid from NullableArrayOfOneMaps_5 {
    nullableArrayOfOneMaps;
  }
}
