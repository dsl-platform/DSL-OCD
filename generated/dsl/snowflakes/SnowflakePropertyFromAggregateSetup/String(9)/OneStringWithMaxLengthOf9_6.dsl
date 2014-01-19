module SnowflakePropertyFromAggregateSetup
{
  aggregate OneStringWithMaxLengthOf9_6 {
    String(9) oneStringWithMaxLengthOf9;
  }

  snowflake OneStringWithMaxLengthOf9_6Grid from OneStringWithMaxLengthOf9_6 {
    oneStringWithMaxLengthOf9;
  }
}
