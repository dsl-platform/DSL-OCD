module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableArrayOfOneIntegers_5 {
    Array<Integer>? nullableArrayOfOneIntegers;
  }

  snowflake NullableArrayOfOneIntegers_5Grid from NullableArrayOfOneIntegers_5 {
    nullableArrayOfOneIntegers;
  }
}
