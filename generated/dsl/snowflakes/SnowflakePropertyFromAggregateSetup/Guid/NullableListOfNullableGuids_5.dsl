module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableListOfNullableGuids_5 {
    List<Guid?>? nullableListOfNullableGuids;
  }

  snowflake NullableListOfNullableGuids_5Grid from NullableListOfNullableGuids_5 {
    nullableListOfNullableGuids;
  }
}
