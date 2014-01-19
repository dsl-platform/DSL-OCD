module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableArrayOfOneDoubles_5 {
    Array<Double>? nullableArrayOfOneDoubles;
  }

  snowflake NullableArrayOfOneDoubles_5Grid from NullableArrayOfOneDoubles_5 {
    nullableArrayOfOneDoubles;
  }
}
