module SnowflakePropertyFromAggregateSetup
{
  aggregate OneArrayOfOneStringsWithMaxLengthOf9_6 {
    Array<String(9)> oneArrayOfOneStringsWithMaxLengthOf9;
  }

  snowflake OneArrayOfOneStringsWithMaxLengthOf9_6Grid from OneArrayOfOneStringsWithMaxLengthOf9_6 {
    oneArrayOfOneStringsWithMaxLengthOf9;
  }
}
