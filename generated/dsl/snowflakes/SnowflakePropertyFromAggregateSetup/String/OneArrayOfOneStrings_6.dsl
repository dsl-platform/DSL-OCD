module SnowflakePropertyFromAggregateSetup
{
  aggregate OneArrayOfOneStrings_6 {
    Array<String> oneArrayOfOneStrings;
  }

  snowflake OneArrayOfOneStrings_6Grid from OneArrayOfOneStrings_6 {
    oneArrayOfOneStrings;
  }
}
