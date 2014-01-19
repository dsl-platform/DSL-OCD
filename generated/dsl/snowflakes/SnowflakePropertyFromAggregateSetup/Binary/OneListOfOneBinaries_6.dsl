module SnowflakePropertyFromAggregateSetup
{
  aggregate OneListOfOneBinaries_6 {
    List<Binary> oneListOfOneBinaries;
  }

  snowflake OneListOfOneBinaries_6Grid from OneListOfOneBinaries_6 {
    oneListOfOneBinaries;
  }
}
