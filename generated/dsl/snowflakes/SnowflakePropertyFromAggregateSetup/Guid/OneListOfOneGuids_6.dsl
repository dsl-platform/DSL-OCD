module SnowflakePropertyFromAggregateSetup
{
  aggregate OneListOfOneGuids_6 {
    List<Guid> oneListOfOneGuids;
  }

  snowflake OneListOfOneGuids_6Grid from OneListOfOneGuids_6 {
    oneListOfOneGuids;
  }
}
