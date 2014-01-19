module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableArrayOfNullableLocations_5 {
    Array<Location?>? nullableArrayOfNullableLocations;
  }

  snowflake NullableArrayOfNullableLocations_5Grid from NullableArrayOfNullableLocations_5 {
    nullableArrayOfNullableLocations;
  }
}
