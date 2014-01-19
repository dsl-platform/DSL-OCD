module SnowflakePropertyFromAggregateSetup
{
  aggregate OneListOfNullableBooleans_6 {
    List<Boolean?> oneListOfNullableBooleans;
  }

  snowflake OneListOfNullableBooleans_6Grid from OneListOfNullableBooleans_6 {
    oneListOfNullableBooleans;
  }
}
