module SnowflakePropertyFromAggregateSetup
{
  aggregate OneListOfNullableLocations_5 {
    List<Location?> oneListOfNullableLocations;
  }

  snowflake OneListOfNullableLocations_5Grid from OneListOfNullableLocations_5 {
    oneListOfNullableLocations;
  }
}
