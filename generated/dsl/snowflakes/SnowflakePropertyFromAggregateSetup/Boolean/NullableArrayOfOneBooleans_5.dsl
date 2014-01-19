module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableArrayOfOneBooleans_5 {
    Array<Boolean>? nullableArrayOfOneBooleans;
  }

  snowflake NullableArrayOfOneBooleans_5Grid from NullableArrayOfOneBooleans_5 {
    nullableArrayOfOneBooleans;
  }
}
