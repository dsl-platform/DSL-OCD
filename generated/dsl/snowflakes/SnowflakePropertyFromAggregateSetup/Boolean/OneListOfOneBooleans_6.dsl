module SnowflakePropertyFromAggregateSetup
{
  aggregate OneListOfOneBooleans_6 {
    List<Boolean> oneListOfOneBooleans;
  }

  snowflake OneListOfOneBooleans_6Grid from OneListOfOneBooleans_6 {
    oneListOfOneBooleans;
  }
}
