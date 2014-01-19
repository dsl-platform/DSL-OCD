module SnowflakePropertyFromAggregateSetup
{
  aggregate OneArrayOfNullableIntegers_6 {
    Array<Integer?> oneArrayOfNullableIntegers;
  }

  snowflake OneArrayOfNullableIntegers_6Grid from OneArrayOfNullableIntegers_6 {
    oneArrayOfNullableIntegers;
  }
}
