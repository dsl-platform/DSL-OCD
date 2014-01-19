module SnowflakePropertyFromAggregateSetup
{
  aggregate OneArrayOfOneBinaries_6 {
    Array<Binary> oneArrayOfOneBinaries;
  }

  snowflake OneArrayOfOneBinaries_6Grid from OneArrayOfOneBinaries_6 {
    oneArrayOfOneBinaries;
  }
}
