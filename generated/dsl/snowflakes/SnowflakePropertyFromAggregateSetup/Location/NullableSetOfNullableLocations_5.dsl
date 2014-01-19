module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableSetOfNullableLocations_5 {
    Set<Location?>? nullableSetOfNullableLocations;
  }

  snowflake NullableSetOfNullableLocations_5Grid from NullableSetOfNullableLocations_5 {
    nullableSetOfNullableLocations;
  }
}
