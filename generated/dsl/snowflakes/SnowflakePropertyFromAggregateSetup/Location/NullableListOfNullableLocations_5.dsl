module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableListOfNullableLocations_5 {
    List<Location?>? nullableListOfNullableLocations;
  }

  snowflake NullableListOfNullableLocations_5Grid from NullableListOfNullableLocations_5 {
    nullableListOfNullableLocations;
  }
}
