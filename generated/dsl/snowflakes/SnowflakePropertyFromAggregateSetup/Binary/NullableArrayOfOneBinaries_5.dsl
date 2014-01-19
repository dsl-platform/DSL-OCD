module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableArrayOfOneBinaries_5 {
    Array<Binary>? nullableArrayOfOneBinaries;
  }

  snowflake NullableArrayOfOneBinaries_5Grid from NullableArrayOfOneBinaries_5 {
    nullableArrayOfOneBinaries;
  }
}
