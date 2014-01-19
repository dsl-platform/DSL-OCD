module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableArrayOfNullableStrings_5 {
    Array<String?>? nullableArrayOfNullableStrings;
  }

  snowflake NullableArrayOfNullableStrings_5Grid from NullableArrayOfNullableStrings_5 {
    nullableArrayOfNullableStrings;
  }
}
