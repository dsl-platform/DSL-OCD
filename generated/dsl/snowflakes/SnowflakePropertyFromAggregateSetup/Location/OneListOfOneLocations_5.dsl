module SnowflakePropertyFromAggregateSetup
{
  aggregate OneListOfOneLocations_5 {
    List<Location> oneListOfOneLocations;
  }

  snowflake OneListOfOneLocations_5Grid from OneListOfOneLocations_5 {
    oneListOfOneLocations;
  }
}
