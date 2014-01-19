module SnowflakePropertyFromAggregateSetup
{
  aggregate OneSetOfNullableLocations_5 {
    Set<Location?> oneSetOfNullableLocations;
  }

  snowflake OneSetOfNullableLocations_5Grid from OneSetOfNullableLocations_5 {
    oneSetOfNullableLocations;
  }
}
