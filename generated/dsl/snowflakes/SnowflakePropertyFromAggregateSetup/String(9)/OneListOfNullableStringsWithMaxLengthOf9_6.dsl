module SnowflakePropertyFromAggregateSetup
{
  aggregate OneListOfNullableStringsWithMaxLengthOf9_6 {
    List<String(9)?> oneListOfNullableStringsWithMaxLengthOf9;
  }

  snowflake OneListOfNullableStringsWithMaxLengthOf9_6Grid from OneListOfNullableStringsWithMaxLengthOf9_6 {
    oneListOfNullableStringsWithMaxLengthOf9;
  }
}
