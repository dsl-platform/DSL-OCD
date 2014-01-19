module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableSetOfNullableBinaries_5 {
    Set<Binary?>? nullableSetOfNullableBinaries;
  }

  snowflake NullableSetOfNullableBinaries_5Grid from NullableSetOfNullableBinaries_5 {
    nullableSetOfNullableBinaries;
  }
}
