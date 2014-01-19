module SnowflakePropertyFromAggregateSetup
{
  aggregate OneSetOfNullableGuids_6 {
    Set<Guid?> oneSetOfNullableGuids;
  }

  snowflake OneSetOfNullableGuids_6Grid from OneSetOfNullableGuids_6 {
    oneSetOfNullableGuids;
  }
}
