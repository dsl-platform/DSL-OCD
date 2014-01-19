module SnowflakePropertyFromAggregateSetup
{
  aggregate OneSetOfOneIntegers_6 {
    Set<Integer> oneSetOfOneIntegers;
  }

  snowflake OneSetOfOneIntegers_6Grid from OneSetOfOneIntegers_6 {
    oneSetOfOneIntegers;
  }
}
