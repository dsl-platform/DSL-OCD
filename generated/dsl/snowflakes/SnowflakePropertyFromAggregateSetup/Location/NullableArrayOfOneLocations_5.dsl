module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableArrayOfOneLocations_5 {
    Array<Location>? nullableArrayOfOneLocations;
  }

  snowflake NullableArrayOfOneLocations_5Grid from NullableArrayOfOneLocations_5 {
    nullableArrayOfOneLocations;
  }
}
