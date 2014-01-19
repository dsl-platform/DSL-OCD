module SnowflakePropertyFromAggregateSetup
{
  aggregate OneListOfOneStringsWithMaxLengthOf9_6 {
    List<String(9)> oneListOfOneStringsWithMaxLengthOf9;
  }

  snowflake OneListOfOneStringsWithMaxLengthOf9_6Grid from OneListOfOneStringsWithMaxLengthOf9_6 {
    oneListOfOneStringsWithMaxLengthOf9;
  }
}
