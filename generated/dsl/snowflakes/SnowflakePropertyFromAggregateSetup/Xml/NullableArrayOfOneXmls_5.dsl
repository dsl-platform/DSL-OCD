module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableArrayOfOneXmls_5 {
    Array<Xml>? nullableArrayOfOneXmls;
  }

  snowflake NullableArrayOfOneXmls_5Grid from NullableArrayOfOneXmls_5 {
    nullableArrayOfOneXmls;
  }
}
