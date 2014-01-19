module SnowflakePropertyFromAggregateSetup
{
  aggregate OneArrayOfOneLocations_5 {
    Array<Location> oneArrayOfOneLocations;
  }

  snowflake OneArrayOfOneLocations_5Grid from OneArrayOfOneLocations_5 {
    oneArrayOfOneLocations;
  }
}
