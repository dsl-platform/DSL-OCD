module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableSetOfOneBinaries_5 {
    Set<Binary>? nullableSetOfOneBinaries;
  }

  snowflake NullableSetOfOneBinaries_5Grid from NullableSetOfOneBinaries_5 {
    nullableSetOfOneBinaries;
  }
}
