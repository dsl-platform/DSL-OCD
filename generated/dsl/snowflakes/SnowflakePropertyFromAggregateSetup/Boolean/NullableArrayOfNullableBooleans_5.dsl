module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableArrayOfNullableBooleans_5 {
    Array<Boolean?>? nullableArrayOfNullableBooleans;
  }

  snowflake NullableArrayOfNullableBooleans_5Grid from NullableArrayOfNullableBooleans_5 {
    nullableArrayOfNullableBooleans;
  }
}
