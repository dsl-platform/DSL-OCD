module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableArrayOfNullableDoubles_5 {
    Array<Double?>? nullableArrayOfNullableDoubles;
  }

  snowflake NullableArrayOfNullableDoubles_5Grid from NullableArrayOfNullableDoubles_5 {
    nullableArrayOfNullableDoubles;
  }
}
