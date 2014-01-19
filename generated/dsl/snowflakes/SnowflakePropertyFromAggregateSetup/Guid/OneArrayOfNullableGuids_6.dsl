module SnowflakePropertyFromAggregateSetup
{
  aggregate OneArrayOfNullableGuids_6 {
    Array<Guid?> oneArrayOfNullableGuids;
  }

  snowflake OneArrayOfNullableGuids_6Grid from OneArrayOfNullableGuids_6 {
    oneArrayOfNullableGuids;
  }
}
