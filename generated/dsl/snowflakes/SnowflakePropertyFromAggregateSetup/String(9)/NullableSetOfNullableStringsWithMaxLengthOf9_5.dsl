module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableSetOfNullableStringsWithMaxLengthOf9_5 {
    Set<String(9)?>? nullableSetOfNullableStringsWithMaxLengthOf9;
  }

  snowflake NullableSetOfNullableStringsWithMaxLengthOf9_5Grid from NullableSetOfNullableStringsWithMaxLengthOf9_5 {
    nullableSetOfNullableStringsWithMaxLengthOf9;
  }
}
