module SnowflakePropertyFromAggregateSetup
{
  aggregate OneArrayOfNullableLocations_5 {
    Array<Location?> oneArrayOfNullableLocations;
  }

  snowflake OneArrayOfNullableLocations_5Grid from OneArrayOfNullableLocations_5 {
    oneArrayOfNullableLocations;
  }
}
