module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableArrayOfOneMonies_5 {
    Array<Money>? nullableArrayOfOneMonies;
  }

  snowflake NullableArrayOfOneMonies_5Grid from NullableArrayOfOneMonies_5 {
    nullableArrayOfOneMonies;
  }
}
