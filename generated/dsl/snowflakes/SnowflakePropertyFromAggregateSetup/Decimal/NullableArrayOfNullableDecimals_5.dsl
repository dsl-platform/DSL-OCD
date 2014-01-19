module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableArrayOfNullableDecimals_5 {
    Array<Decimal?>? nullableArrayOfNullableDecimals;
  }

  snowflake NullableArrayOfNullableDecimals_5Grid from NullableArrayOfNullableDecimals_5 {
    nullableArrayOfNullableDecimals;
  }
}
