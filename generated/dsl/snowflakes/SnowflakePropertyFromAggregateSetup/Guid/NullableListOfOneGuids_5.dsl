module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableListOfOneGuids_5 {
    List<Guid>? nullableListOfOneGuids;
  }

  snowflake NullableListOfOneGuids_5Grid from NullableListOfOneGuids_5 {
    nullableListOfOneGuids;
  }
}
