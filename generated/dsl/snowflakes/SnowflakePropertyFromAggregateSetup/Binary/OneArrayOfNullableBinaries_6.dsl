module SnowflakePropertyFromAggregateSetup
{
  aggregate OneArrayOfNullableBinaries_6 {
    Array<Binary?> oneArrayOfNullableBinaries;
  }

  snowflake OneArrayOfNullableBinaries_6Grid from OneArrayOfNullableBinaries_6 {
    oneArrayOfNullableBinaries;
  }
}
