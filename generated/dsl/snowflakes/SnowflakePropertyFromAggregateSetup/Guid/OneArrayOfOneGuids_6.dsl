module SnowflakePropertyFromAggregateSetup
{
  aggregate OneArrayOfOneGuids_6 {
    Array<Guid> oneArrayOfOneGuids;
  }

  snowflake OneArrayOfOneGuids_6Grid from OneArrayOfOneGuids_6 {
    oneArrayOfOneGuids;
  }
}
