module SnowflakePropertyFromAggregateSetup
{
  aggregate OneSetOfOneLocations_5 {
    Set<Location> oneSetOfOneLocations;
  }

  snowflake OneSetOfOneLocations_5Grid from OneSetOfOneLocations_5 {
    oneSetOfOneLocations;
  }
}
