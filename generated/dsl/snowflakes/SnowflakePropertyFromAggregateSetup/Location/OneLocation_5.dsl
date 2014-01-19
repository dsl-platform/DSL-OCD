module SnowflakePropertyFromAggregateSetup
{
  aggregate OneLocation_5 {
    Location oneLocation;
  }

  snowflake OneLocation_5Grid from OneLocation_5 {
    oneLocation;
  }
}
