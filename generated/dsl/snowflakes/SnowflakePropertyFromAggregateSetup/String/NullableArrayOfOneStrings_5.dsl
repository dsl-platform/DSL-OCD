module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableArrayOfOneStrings_5 {
    Array<String>? nullableArrayOfOneStrings;
  }

  snowflake NullableArrayOfOneStrings_5Grid from NullableArrayOfOneStrings_5 {
    nullableArrayOfOneStrings;
  }
}
