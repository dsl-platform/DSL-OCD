module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableArrayOfNullableStringsWithMaxLengthOf9_5 {
    Array<String(9)?>? nullableArrayOfNullableStringsWithMaxLengthOf9;
  }

  snowflake NullableArrayOfNullableStringsWithMaxLengthOf9_5Grid from NullableArrayOfNullableStringsWithMaxLengthOf9_5 {
    nullableArrayOfNullableStringsWithMaxLengthOf9;
  }
}
