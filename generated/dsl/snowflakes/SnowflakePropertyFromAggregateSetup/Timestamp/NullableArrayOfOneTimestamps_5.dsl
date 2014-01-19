module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableArrayOfOneTimestamps_5 {
    Array<Timestamp>? nullableArrayOfOneTimestamps;
  }

  snowflake NullableArrayOfOneTimestamps_5Grid from NullableArrayOfOneTimestamps_5 {
    nullableArrayOfOneTimestamps;
  }
}
