module SnowflakePropertyFromAggregateSetup
{
  aggregate OneSetOfOneBinaries_6 {
    Set<Binary> oneSetOfOneBinaries;
  }

  snowflake OneSetOfOneBinaries_6Grid from OneSetOfOneBinaries_6 {
    oneSetOfOneBinaries;
  }
}
