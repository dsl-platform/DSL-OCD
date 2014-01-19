module SnowflakePropertyFromAggregateSetup
{
  aggregate OneArrayOfOneIntegers_6 {
    Array<Integer> oneArrayOfOneIntegers;
  }

  snowflake OneArrayOfOneIntegers_6Grid from OneArrayOfOneIntegers_6 {
    oneArrayOfOneIntegers;
  }
}
