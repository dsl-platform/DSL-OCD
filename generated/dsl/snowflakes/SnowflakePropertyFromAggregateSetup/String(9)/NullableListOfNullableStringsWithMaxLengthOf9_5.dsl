module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableListOfNullableStringsWithMaxLengthOf9_5 {
    List<String(9)?>? nullableListOfNullableStringsWithMaxLengthOf9;
  }

  snowflake NullableListOfNullableStringsWithMaxLengthOf9_5Grid from NullableListOfNullableStringsWithMaxLengthOf9_5 {
    nullableListOfNullableStringsWithMaxLengthOf9;
  }
}
