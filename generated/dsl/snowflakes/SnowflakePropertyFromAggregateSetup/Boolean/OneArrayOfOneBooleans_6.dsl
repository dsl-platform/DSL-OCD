module SnowflakePropertyFromAggregateSetup
{
  aggregate OneArrayOfOneBooleans_6 {
    Array<Boolean> oneArrayOfOneBooleans;
  }

  snowflake OneArrayOfOneBooleans_6Grid from OneArrayOfOneBooleans_6 {
    oneArrayOfOneBooleans;
  }
}
