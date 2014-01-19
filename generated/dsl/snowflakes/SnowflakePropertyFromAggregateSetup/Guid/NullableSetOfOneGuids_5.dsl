module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableSetOfOneGuids_5 {
    Set<Guid>? nullableSetOfOneGuids;
  }

  snowflake NullableSetOfOneGuids_5Grid from NullableSetOfOneGuids_5 {
    nullableSetOfOneGuids;
  }
}
