module SnowflakePropertyFromAggregateSetup
{
  aggregate OneListOfOneIntegers_6 {
    List<Integer> oneListOfOneIntegers;
  }

  snowflake OneListOfOneIntegers_6Grid from OneListOfOneIntegers_6 {
    oneListOfOneIntegers;
  }
}
