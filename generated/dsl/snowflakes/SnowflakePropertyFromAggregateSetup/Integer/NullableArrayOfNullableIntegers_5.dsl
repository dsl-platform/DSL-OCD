module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableArrayOfNullableIntegers_5 {
    Array<Integer?>? nullableArrayOfNullableIntegers;
  }

  snowflake NullableArrayOfNullableIntegers_5Grid from NullableArrayOfNullableIntegers_5 {
    nullableArrayOfNullableIntegers;
  }
}
