module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableStringWithMaxLengthOf9_5 {
    String(9)? nullableStringWithMaxLengthOf9;
  }

  snowflake NullableStringWithMaxLengthOf9_5Grid from NullableStringWithMaxLengthOf9_5 {
    nullableStringWithMaxLengthOf9;
  }
}
