module SnowflakePropertyFromAggregateSetup
{
  aggregate OneSetOfOneGuids_6 {
    Set<Guid> oneSetOfOneGuids;
  }

  snowflake OneSetOfOneGuids_6Grid from OneSetOfOneGuids_6 {
    oneSetOfOneGuids;
  }
}
