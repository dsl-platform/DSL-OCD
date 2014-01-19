module SnowflakePropertyFromAggregateSetup
{
  aggregate OneArrayOfNullableStringsWithMaxLengthOf9_6 {
    Array<String(9)?> oneArrayOfNullableStringsWithMaxLengthOf9;
  }

  snowflake OneArrayOfNullableStringsWithMaxLengthOf9_6Grid from OneArrayOfNullableStringsWithMaxLengthOf9_6 {
    oneArrayOfNullableStringsWithMaxLengthOf9;
  }
}
