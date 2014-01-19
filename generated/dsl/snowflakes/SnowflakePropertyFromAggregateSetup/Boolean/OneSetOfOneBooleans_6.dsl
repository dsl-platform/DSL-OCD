module SnowflakePropertyFromAggregateSetup
{
  aggregate OneSetOfOneBooleans_6 {
    Set<Boolean> oneSetOfOneBooleans;
  }

  snowflake OneSetOfOneBooleans_6Grid from OneSetOfOneBooleans_6 {
    oneSetOfOneBooleans;
  }
}
