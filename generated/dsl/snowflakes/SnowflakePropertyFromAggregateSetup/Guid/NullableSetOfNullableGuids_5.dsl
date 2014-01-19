module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableSetOfNullableGuids_5 {
    Set<Guid?>? nullableSetOfNullableGuids;
  }

  snowflake NullableSetOfNullableGuids_5Grid from NullableSetOfNullableGuids_5 {
    nullableSetOfNullableGuids;
  }
}
