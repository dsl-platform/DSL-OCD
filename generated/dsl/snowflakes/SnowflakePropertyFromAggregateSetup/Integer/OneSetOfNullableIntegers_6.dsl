module SnowflakePropertyFromAggregateSetup
{
  aggregate OneSetOfNullableIntegers_6 {
    Set<Integer?> oneSetOfNullableIntegers;
  }

  snowflake OneSetOfNullableIntegers_6Grid from OneSetOfNullableIntegers_6 {
    oneSetOfNullableIntegers;
  }
}
