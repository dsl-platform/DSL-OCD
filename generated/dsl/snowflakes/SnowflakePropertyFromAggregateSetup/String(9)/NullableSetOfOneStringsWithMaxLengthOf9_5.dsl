module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableSetOfOneStringsWithMaxLengthOf9_5 {
    Set<String(9)>? nullableSetOfOneStringsWithMaxLengthOf9;
  }

  snowflake NullableSetOfOneStringsWithMaxLengthOf9_5Grid from NullableSetOfOneStringsWithMaxLengthOf9_5 {
    nullableSetOfOneStringsWithMaxLengthOf9;
  }
}
