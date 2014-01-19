module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableArrayOfNullableLongs_5 {
    Array<Long?>? nullableArrayOfNullableLongs;
  }

  snowflake NullableArrayOfNullableLongs_5Grid from NullableArrayOfNullableLongs_5 {
    nullableArrayOfNullableLongs;
  }
}
