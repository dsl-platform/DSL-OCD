module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableArrayOfNullableBinaries_5 {
    Array<Binary?>? nullableArrayOfNullableBinaries;
  }

  snowflake NullableArrayOfNullableBinaries_5Grid from NullableArrayOfNullableBinaries_5 {
    nullableArrayOfNullableBinaries;
  }
}
