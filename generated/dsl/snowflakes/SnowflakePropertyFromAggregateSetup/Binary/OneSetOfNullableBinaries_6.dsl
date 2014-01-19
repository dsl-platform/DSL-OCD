module SnowflakePropertyFromAggregateSetup
{
  aggregate OneSetOfNullableBinaries_6 {
    Set<Binary?> oneSetOfNullableBinaries;
  }

  snowflake OneSetOfNullableBinaries_6Grid from OneSetOfNullableBinaries_6 {
    oneSetOfNullableBinaries;
  }
}
