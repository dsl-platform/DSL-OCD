module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableArrayOfNullableXmls_5 {
    Array<Xml?>? nullableArrayOfNullableXmls;
  }

  snowflake NullableArrayOfNullableXmls_5Grid from NullableArrayOfNullableXmls_5 {
    nullableArrayOfNullableXmls;
  }
}
