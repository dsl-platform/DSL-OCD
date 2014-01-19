module SnowflakePropertyFromAggregateSetup
{
  aggregate OneListOfNullableIntegers_6 {
    List<Integer?> oneListOfNullableIntegers;
  }

  snowflake OneListOfNullableIntegers_6Grid from OneListOfNullableIntegers_6 {
    oneListOfNullableIntegers;
  }
}
