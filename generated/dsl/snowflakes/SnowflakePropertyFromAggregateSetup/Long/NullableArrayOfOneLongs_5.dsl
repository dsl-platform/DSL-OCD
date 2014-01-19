module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableArrayOfOneLongs_5 {
    Array<Long>? nullableArrayOfOneLongs;
  }

  snowflake NullableArrayOfOneLongs_5Grid from NullableArrayOfOneLongs_5 {
    nullableArrayOfOneLongs;
  }
}
