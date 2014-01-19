module SnowflakePropertyFromAggregateSetup
{
  aggregate OneListOfNullableGuids_6 {
    List<Guid?> oneListOfNullableGuids;
  }

  snowflake OneListOfNullableGuids_6Grid from OneListOfNullableGuids_6 {
    oneListOfNullableGuids;
  }
}
