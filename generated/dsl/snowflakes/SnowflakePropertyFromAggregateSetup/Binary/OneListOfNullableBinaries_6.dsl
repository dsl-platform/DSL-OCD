module SnowflakePropertyFromAggregateSetup
{
  aggregate OneListOfNullableBinaries_6 {
    List<Binary?> oneListOfNullableBinaries;
  }

  snowflake OneListOfNullableBinaries_6Grid from OneListOfNullableBinaries_6 {
    oneListOfNullableBinaries;
  }
}
