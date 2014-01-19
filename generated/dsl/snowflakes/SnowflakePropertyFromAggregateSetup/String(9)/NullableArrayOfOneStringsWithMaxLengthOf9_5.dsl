module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableArrayOfOneStringsWithMaxLengthOf9_5 {
    Array<String(9)>? nullableArrayOfOneStringsWithMaxLengthOf9;
  }

  snowflake NullableArrayOfOneStringsWithMaxLengthOf9_5Grid from NullableArrayOfOneStringsWithMaxLengthOf9_5 {
    nullableArrayOfOneStringsWithMaxLengthOf9;
  }
}
