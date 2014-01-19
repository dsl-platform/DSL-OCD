module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableArrayOfNullableMonies_5 {
    Array<Money?>? nullableArrayOfNullableMonies;
  }

  snowflake NullableArrayOfNullableMonies_5Grid from NullableArrayOfNullableMonies_5 {
    nullableArrayOfNullableMonies;
  }
}
