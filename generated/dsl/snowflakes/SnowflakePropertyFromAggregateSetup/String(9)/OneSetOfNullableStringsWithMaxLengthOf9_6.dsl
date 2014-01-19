module SnowflakePropertyFromAggregateSetup
{
  aggregate OneSetOfNullableStringsWithMaxLengthOf9_6 {
    Set<String(9)?> oneSetOfNullableStringsWithMaxLengthOf9;
  }

  snowflake OneSetOfNullableStringsWithMaxLengthOf9_6Grid from OneSetOfNullableStringsWithMaxLengthOf9_6 {
    oneSetOfNullableStringsWithMaxLengthOf9;
  }
}
