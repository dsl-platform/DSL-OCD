module SnowflakePropertyFromAggregateSetup
{
  aggregate OneSetOfOneStringsWithMaxLengthOf9_6 {
    Set<String(9)> oneSetOfOneStringsWithMaxLengthOf9;
  }

  snowflake OneSetOfOneStringsWithMaxLengthOf9_6Grid from OneSetOfOneStringsWithMaxLengthOf9_6 {
    oneSetOfOneStringsWithMaxLengthOf9;
  }
}
