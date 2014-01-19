module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableArrayOfNullableGuids_5 {
    Array<Guid?>? nullableArrayOfNullableGuids;
  }

  snowflake NullableArrayOfNullableGuids_5Grid from NullableArrayOfNullableGuids_5 {
    nullableArrayOfNullableGuids;
  }
}
