module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableListOfOneLocations_5 {
    List<Location>? nullableListOfOneLocations;
  }

  snowflake NullableListOfOneLocations_5Grid from NullableListOfOneLocations_5 {
    nullableListOfOneLocations;
  }
}
