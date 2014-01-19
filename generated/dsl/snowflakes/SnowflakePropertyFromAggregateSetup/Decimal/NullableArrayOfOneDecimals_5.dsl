module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableArrayOfOneDecimals_5 {
    Array<Decimal>? nullableArrayOfOneDecimals;
  }

  snowflake NullableArrayOfOneDecimals_5Grid from NullableArrayOfOneDecimals_5 {
    nullableArrayOfOneDecimals;
  }
}
