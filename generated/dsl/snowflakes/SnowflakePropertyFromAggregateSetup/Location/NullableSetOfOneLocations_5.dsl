module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableSetOfOneLocations_5 {
    Set<Location>? nullableSetOfOneLocations;
  }

  snowflake NullableSetOfOneLocations_5Grid from NullableSetOfOneLocations_5 {
    nullableSetOfOneLocations;
  }
}
