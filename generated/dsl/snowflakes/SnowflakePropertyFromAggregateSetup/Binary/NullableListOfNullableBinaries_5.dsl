module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableListOfNullableBinaries_5 {
    List<Binary?>? nullableListOfNullableBinaries;
  }

  snowflake NullableListOfNullableBinaries_5Grid from NullableListOfNullableBinaries_5 {
    nullableListOfNullableBinaries;
  }
}
