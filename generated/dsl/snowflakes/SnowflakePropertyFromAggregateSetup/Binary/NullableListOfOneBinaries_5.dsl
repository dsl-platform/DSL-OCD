module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableListOfOneBinaries_5 {
    List<Binary>? nullableListOfOneBinaries;
  }

  snowflake NullableListOfOneBinaries_5Grid from NullableListOfOneBinaries_5 {
    nullableListOfOneBinaries;
  }
}
