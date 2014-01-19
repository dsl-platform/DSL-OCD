module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableArrayOfOneGuids_5 {
    Array<Guid>? nullableArrayOfOneGuids;
  }

  snowflake NullableArrayOfOneGuids_5Grid from NullableArrayOfOneGuids_5 {
    nullableArrayOfOneGuids;
  }
}
