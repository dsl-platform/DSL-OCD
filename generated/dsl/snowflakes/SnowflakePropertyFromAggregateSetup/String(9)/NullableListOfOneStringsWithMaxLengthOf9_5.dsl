module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableListOfOneStringsWithMaxLengthOf9_5 {
    List<String(9)>? nullableListOfOneStringsWithMaxLengthOf9;
  }

  snowflake NullableListOfOneStringsWithMaxLengthOf9_5Grid from NullableListOfOneStringsWithMaxLengthOf9_5 {
    nullableListOfOneStringsWithMaxLengthOf9;
  }
}
